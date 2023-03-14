package study03;

import java.util.*;

public class ArrayListRun {

	public static void main(String[] args) {
		//class 객체로 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<>();		
		ArrayList<Integer> list3 = new ArrayList<>(10);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("안녕하세요");
		strList.add("안녕");
		strList.add("잘 가세요");

		
		System.out.println(strList);
		System.out.println(list3.size());
		strList.add(1, "수민"); // add  -> 해당인덱스칸에 값을 삽입해서 추가
		System.out.println(strList);
		System.out.println(strList.size());
		strList.set(2, "148cm"); // set -> 해당인덱스칸에 값을 수정
		System.out.println(strList);
		strList.remove("잘 가세요"); //동일객체 삭제
		System.out.println(strList);
		strList.remove(0); // 해당인덱스값 삭제
		System.out.println(strList);
		System.out.println(strList.size());
		strList.clear();//클리어 -> 해당내용 다 삭제
		System.out.println(strList);
		
		strList.add("김현석");
		strList.add("김지훈");
		strList.add("김종욱");
		System.out.println(strList);

		for(int i=0;i<strList.size();i++) {
			System.out.print(strList.get(i)+" ");
		}
		System.out.println();
		for(String str:strList) {
			System.out.print(str+" ");	
		}
		System.out.println();
		//검색
		System.out.println( strList.contains("김현석"));
		System.out.println( strList.indexOf("김지훈"));
		System.out.println( strList.indexOf("없는값"));
		
		//복사
		System.out.println(strList);
		//clone()
		ArrayList<String> newStr1 = 
				(ArrayList<String>)strList.clone();
		printArrayList(newStr1);
		//addAll()
		ArrayList<String> newStr2 = new ArrayList<>();
		newStr2.addAll(strList);
		printArrayList(newStr2);
		//for
		ArrayList<String> newStr3 = new ArrayList<>();
		for(String str:strList) {
			newStr3.add(str);
		}
		printArrayList(newStr3);
		
		//isEmpty()
		System.out.println(newStr3.isEmpty());
		newStr3.clear();
		System.out.println(newStr3.isEmpty());
	}
	
	static void printArrayList(ArrayList<String> arr) {
		for(String str:arr) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
}
