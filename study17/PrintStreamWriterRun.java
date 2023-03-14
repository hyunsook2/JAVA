package study17;

import java.io.*;

import study01.Sysout;

public class PrintStreamWriterRun {
	public static void main(String[] args) {
		File psf = new File("C:\\Users\\kosmo\\javastudy\\src\\study17\\study17.files\\PrintStream.txt");
		File pwf = new File("C:\\Users\\kosmo\\javastudy\\src\\study17\\study17.files\\PrintWriter.txt");

		try (
				PrintStream ps = new PrintStream(psf);
				OutputStream os = new FileOutputStream(psf);
				PrintWriter ps3 = new PrintWriter(new FileWriter(psf));
				PrintStream ps4 = new PrintStream(System.out);
			) {
				ps4.println(10.9);
				ps4.print(10 + "년" + 9 + "개월 \n");
				ps4.printf("%s", "우리나라");
				ps4.println();
	
				ps3.println(9);
				ps3.print(2 + "년" + 4 + "개월 \n");
				ps3.printf("%s", "너희나라");
				ps3.println();
			} catch (IOException e) {
				e.printStackTrace();
			}

		try (
				// PrintWriter pw = new PrintWriter(pwf);
				// OutputStream os = new FileOutputStream(pwf);
				PrintWriter pw3 = new PrintWriter(new FileWriter(pwf));
				PrintWriter pw4 = new PrintWriter(System.out);
			){
				pw3.println(10.9);
				pw3.print(10 + "년" + 9 + "개월 \n");
				pw3.printf("%s", "우리나라");
				pw3.println();
	
				pw4.println(9);
				pw4.print(2 + "년" + 4 + "개월 \n");
				pw4.printf("%s", "너희나라");
				pw4.println();
			} catch (IOException e) {
				e.printStackTrace();
		}
	}
}