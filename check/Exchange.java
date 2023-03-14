package check;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("유로 : ");
			float u = input.nextFloat();
		System.out.print("달러 : ");
			float d = input.nextFloat();
			
			float ud = (float) (u*1.09);
			float du = (float) (d*0.92);
			
			float dw = (float) (d*1228.92);
			float uw = (float) (u*1336.42);
			
			float w = dw+uw;
			
		 System.out.printf("유로를->달러로환전 : %.2f달러%n"
		 				+ "달러를->유로로환전 : %.2f유로%n"
		 				+ "두값을 한국돈으로 환전시 : %.0f원",ud,du,w);
	}

}
