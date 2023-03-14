package test3;

import java.util.ArrayList;
import java.util.TreeSet;

public class StreamTest1 {
	public static void main(String[] args) {
		StreamTest1 run = new StreamTest1();
		
		System.out.println(run.question1());
//		System.out.println(run.question2);
		System.out.println(run.question3());
//		System.out.println(run.question4);	
	}
	private static final String[] STRARR= {"Pie","pi","P","cake"};
	//문자열 배열의 모든 문자열의 길이를 더한 결과를 출력
	//.mapToInt(  ) 해당 배열의 내부의 결과값을 Integer타입을 바꾼 스트림으로 반환
	public int question1() {

		return ;
	}
	//문자열 배열의 문자열중에서 가장 긴 것의 길이를 출력
	
	public int question2() {
		return 1;
	}
	//int->Integer 기본형 ->래퍼클래스 . boxed()
	//임의의 로또 번호 1~45를 정렬하여 출력
	public int question3() {
			ArrayList<TreeSet<Integer>> lottoList = new ArrayList<>();
			int count = 1;
			for(int i=0;i<count;i++) {
				TreeSet<Integer> lottoSet = new TreeSet<>();
				while(lottoSet.size()<6) {
					lottoSet.add((int)(Math.random()*45+1));
				}
				lottoList.add(lottoSet);
			}
			System.out.print("question3 :");
			for(TreeSet<Integer> lotto:lottoList) {
				System.out.println(lotto);
			}
			return 0;
		}
	
	// 두개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력
	public int question4() {
		return 1;
	}
	
	
}
