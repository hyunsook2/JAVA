package check;
import java.util.Scanner;

public class Alba {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("시급 : ");
		 int m = input.nextInt();
		System.out.print("일한 시간 : ");
		 int t = input.nextInt();
		 int w = m*t;
		System.out.println("급여 : "+w+"원");
	}
}
