package test1;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		// 초를 입력받아서 시간 분 초로 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("초를 입력하시오 : ");
		int time = scan.nextInt();
		scan.close();
		
		int hour = 0;
		int minute = 0;
		int second = 0; 
		
		hour = time/3600;
		minute = (time%3600)/60;
		second = (time%3600)%60;
			
		System.out.println("결과 출력 : "+time+"초 =>");
		
		if(time > 3600 ) {
			hour++;
			System.out.printf("%d시간",hour);
		}
		if(time > 60) {
			minute++;
			System.out.printf("%d분",minute);
		}
		if(time > 0) {
			System.out.printf("%d초",second);
		}
		
		
		
	}	
	
}
