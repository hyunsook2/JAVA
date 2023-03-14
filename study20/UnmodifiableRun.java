package study20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableRun {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		try {
			list.forEach(System.out::println);
			list = Collections.unmodifiableList(list);// 추가 삭제 불가
			list.add('e'); // UnsupportedOperation예외 (추가불가능)
			list.remove(2); // UnsupportedOperation예외 (삭제불가능)
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		System.out.println(list);
		List<Character> newList = new ArrayList<>(list);
		newList.add('k');
		System.out.println(list);
		System.out.println(newList);
		
		List<Character> unmodList = Collections.unmodifiableList(newList);
		System.out.println(newList);
		System.out.println(unmodList);
		
		try {
			unmodList.add('e');
		} catch (Exception e) {
			e.printStackTrace();
		}
		newList.add('z');
		System.out.println(unmodList);//원본리스트에 추가된 내용이 같이 반영
	}
}
