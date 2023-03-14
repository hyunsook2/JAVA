package check;

import java.util.Scanner;

import study01.Sysout;

public class BusCard {

	public static String getRole(int age) {
		String role="";	
		return "";	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요 : ");
		int age = input.nextInt();
		String role = getRole(age);
		System.out.print(role);
		int charge = 0;
		if (age <= 5) {
			charge = 0;
			System.out.println("유아 입니다");
		} else if (age < 12) {
			charge = 1500;
			System.out.println("어린이 입니다");
		} else if (age < 19) {
			charge = 2500;
			System.out.println("청소년 입니다");
		} else if (age < 60) {
			charge = 3000;
			System.out.println("성인 입니다");
		} else {
			charge = 0;
			System.out.println("노약자 입니다");
		}
		System.out.println("교통비 : " + charge + "원 입니다");
	}
	

}
