package IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		FileOutputStream fout = new FileOutputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data1");
//		
//		BufferedOutputStream bof = new BufferedOutputStream(fout);
//		
//		String str = "I am Prajwal";
//		
//		byte[] b = str.getBytes();
//		
//		System.out.println(b);
//		
//		try {
//			bof.write(b);
//			bof.flush();
//			bof.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		FileInputStream fin = new FileInputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data1");
		BufferedInputStream bis = new BufferedInputStream(fin);
		
		int i;

		while((i= bis.read()) != -1){
		  System.out.print((char) i);	
		}
		bis.close();
		fin.close();
		
	}

}
