package test3;

import java.io.File;
import java.nio.file.Files;

public class FileDirTest {
	public static void main(String[] args) {
		String path="C:\\Users\\kosmo\\javastudy\\src";
		File src = new File(path);
		//현재폴더의 하부 파일과 디렉토리를 구분하여 출력
		File[] files = src.listFiles();
		for(File file:files) {
			if(file.isDirectory()) {
				System.out.print("폴더:"+file.getName()+" \t"+file.getPath());
			}else {
				System.out.print("파일:"+file.getName()+" \t"+file.getPath());
			}
			System.out.println(file.getName()+" \t"+file.getPath());
		}
	}
}
