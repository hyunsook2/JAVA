package study17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamRun {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\kosmo\\javastudy\\src\\study17\\file.data");
		
		try(
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				DataInputStream dis = new DataInputStream(bis);
				DataOutputStream dos = new DataOutputStream(bos);
		){
			dos.writeInt(99);
			dos.writeDouble(11.12);
			dos.writeChar('A');
			dos.writeChar('B');
			dos.writeUTF("우리나라");
			dos.flush();
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}catch (IOException e) { e.printStackTrace(); }
		
		}
	}

