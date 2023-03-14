package test3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IOTest {
	public static void main(String[] args) throws IOException {
		// FileOutputStream OutputStreamWriter를 활용 a.txt 파일 출력
		// 자바 공부 열심히.

		try (OutputStream file = new FileOutputStream("C:\\Users\\kosmo\\javastudy\\src\\test3\\a.txt");
				OutputStreamWriter output = new OutputStreamWriter(file);) {
			output.write("자바공부 열심히.");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			System.out.println("완료");
		}
	}
}
