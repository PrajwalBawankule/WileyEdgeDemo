package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AbstractStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		OutputStream fout = new FileOutputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data4.txt");
//	
//		String str = "I am Prajwal Hello all";
//		byte[] b = str.getBytes();
//		
//		fout.write(b);
//		fout.flush();
//		fout.close();
		
		InputStream fis = new FileInputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data4.txt");
		
		int j;

		while((j= fis.read()) != -1){
		  System.out.print((char) j);	
		}
		fis.close();
	}

}
