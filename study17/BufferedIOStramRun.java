package study17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOStramRun {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\kosmo\\javastudy\\src\\study17\\study17.files\\BufferedFile.txt");
		File file2 = new File("C:\\Users\\kosmo\\javastudy\\src\\study17\\study17.files\\BufferedOutFile.txt");
		try (
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(file2);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
		){
				int i;
				while((i=bis.read())!=-1) {
					bos.write(i);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file);
	}
}