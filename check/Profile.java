package check;

import java.util.Scanner;

public class Profile {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	String name = "홍길동";
	int Id = 2018122104;
	double tall = 1.75;
	boolean gender = true;
	
	System.out.printf("이름 :"+name
						+"%n학번 :"+Id
						+"%n신장 :"+tall+"m"
						+"%n남자인가요? :"+gender);
			
	}
}
