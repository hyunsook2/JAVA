package study17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileInputOutputStreamRun {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\kosmo\\javastudy\\src\\study17\\TestFile.txt");
		
		OutputStream os1 = new FileOutputStream(file);
		byte[] barr1 = "InputOutPut practice".getBytes();
		
		os1.write(barr1);
		os1.write('\n');
		os1.flush();
		os1.close();
		
		InputStream is = new FileInputStream(file);
		int data;
		while((data=is.read())!=-1) {
			System.out.println((char)data+" "+is.available());
		}
		is.close();
		
		InputStream is2 = new FileInputStream(file);
		byte[] barr = new byte[23];
		int data2;
		while((data2=is2.read(barr))!=-1) {
			for(int i=0;i<data2;i++) {
				System.out.print((char)barr[i]);
			}
			System.out.println(Arrays.toString(barr));
			System.out.println(data2);
		}
		is2.close();
		
		//files/TestFileOut.txt
		//ABCD...Z
		byte[] barr2 = new byte[26];
		byte dataS = 65;
		for(int i=0;i<barr2.length;i++) {
			barr2[i]=dataS++;
		}	
		try(FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\kosmo\\javastudy\\src\\study17\\study17.files\\TestFileOut.txt")
		) {
			fos.write(barr2);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("완료");
	}
}