package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public class NumberConvert {
	public static void main(String[] args) {
		// 중복제거 오름차순 정렬
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(7, 3, 2, 1, 1, 2, 9, 6, 4, 7, 3, 5, 8, 10, 4));
		TreeSet<Integer> num2 = new TreeSet<>(num);
		System.out.println(num2);
		NavigableSet<Integer> num3 = new TreeSet<>(num).descendingSet();
		System.out.println(num3);

		System.out.println();
		ArrayList<Integer> num4 = new ArrayList<>();
		Random ranNum = new Random();
		for(int i = 0 ; i<20; i++) {
			num4.add(ranNum.nextInt(1,11));
		}
		TreeSet<Integer> tset2 = new TreeSet<>(num4); //올림차순
		NavigableSet<Integer> tset3 = new TreeSet<>(num4).descendingSet(); //내림차순
		System.out.println(num4);
		System.out.println(tset2);
		System.out.println(tset3);
	}
}
