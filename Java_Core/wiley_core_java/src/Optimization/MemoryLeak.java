package Optimization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//try with resources is a Java 7 feature that can automatically close resources such as 
//streams and files when they are no longer needed
//This can prevent memory leaks and imporve performance

public class MemoryLeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("myfile.txt");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
		
		//efficient way using try with resources
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
