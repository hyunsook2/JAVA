package study01;

import java.util.Scanner;

public class Sysout {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력:");
		int line = scan.nextInt();
		System.out.println(line);
		
		System.out.println("출력"); // ln붙히면 출력후 줄바꿈
		System.out.print("hello");
		System.out.print("\n");//"\n"을넣으면 print에서도 줄바꿈가능
		System.out.print("world");
		System.out.print("\n");
		
		String world = "World";
		String java = "Java";
		System.out.printf("Hello, %s, %s, %n %s",java,java,world); // %n 줄바꿈 %s 스트링출력
		
	}
	
}