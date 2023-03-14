package test3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MakeSomethingNew {
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		
		// test3.files 아래로 폴더명과 파일명을 입력 받아서 새로 생성
		
		String path = "C:\\Users\\kosmo\\javastudy\\src\\test3\\files";
		
		File file = new File(path);
		System.out.println("폴더명:");
		File ff = new File(path + "/" + aa.next());
		System.out.println("파일명:");
		File fName = new File(ff + "/" + aa.next());
		try {
			if (!ff.exists()) {
				ff.mkdir();
			}
			if (!fName.exists()) {
				fName.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("생성");
	}
}