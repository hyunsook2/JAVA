package study17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerPrac {
	public static void main(String[] args) {
			File file = new File("C:\\Users\\kosmo\\javastudy\\src\\study17\\study17.files\\Input.txt");
			try(Scanner sc = new Scanner(file)){
			int zz = 0;
				while(sc.hasNextInt()) {
					zz += sc.nextInt();
				}
				System.out.println(zz);
				
			}catch(IOException e) {
				e.printStackTrace();
		}
	}
}
