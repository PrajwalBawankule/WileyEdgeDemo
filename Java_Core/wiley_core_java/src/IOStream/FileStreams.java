package IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		FileOutputStream fout = new FileOutputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data4.txt");
//	
//		String str = "I am Prajwal";
//		byte[] b = str.getBytes();
//		
//		fout.write(b);
//		fout.flush();
//		fout.close();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data4.txt");
		
		int j;

		while((j= fis.read()) != -1){
		  System.out.print((char) j);	
		}
		fis.close();
	}

}
