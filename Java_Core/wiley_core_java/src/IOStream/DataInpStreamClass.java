package IOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInpStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fout = new FileOutputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data1");
//		
//		DataOutputStream dos = new DataOutputStream(fout);
//		dos.writeBytes("I am a Programmer");
//		dos.flush();
//		dos.close();
		
		FileInputStream fin = new FileInputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data1");
		
		DataInputStream dis = new DataInputStream(fin);
		
		int count = fin.available();
		
		byte[] ba = new byte[count];
		
		dis.read(ba);
		for(byte b: ba) {
			System.out.println((char) b);
		}
		
		dis.close();
		fin.close();
		
		
	}

}
