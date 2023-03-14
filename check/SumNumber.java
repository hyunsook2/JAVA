package check;

import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("세자리숫자 : ");
		int i = input.nextInt();
		int a,b,c = 0;
		a = i/100; //백의자리
		b = (i%100)/10; //십의자리
		c = (i%100)%10; //일의자리
		if(i > 999 || i < 100 ) {
			System.out.print("세자리 정수를 입력해주세요");
		}
		else{
			System.out.println(a+b+c);
		}
	}
}
