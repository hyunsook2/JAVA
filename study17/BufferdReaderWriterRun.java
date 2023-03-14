package study17;

import java.io.*;

public class BufferdReaderWriterRun {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\kosmo\\javastudy\\src\\study17\\FileReadWriter");
		try(
			Writer writer = new FileWriter(file);
			Reader reader = new FileReader(file);
			BufferedWriter bw = new BufferedWriter(writer);
			BufferedReader br = new BufferedReader(reader);
		){
				bw.write("Seoul Korea\n".toCharArray());
				bw.write(123);
				bw.write("come to my home",3,8);
				bw.flush();
				
				String data;
				while((data=br.readLine())!=null) {
					System.out.println(data);
				}
		}catch (IOException e) { e.printStackTrace();}
	}
}
