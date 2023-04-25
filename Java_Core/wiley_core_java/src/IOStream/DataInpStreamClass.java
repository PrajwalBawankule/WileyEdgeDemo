package IOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInpStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data1");
		
		DataOutputStream dos = new DataOutputStream(fout);
		dos.writeBytes("I am a Programmer");
		dos.flush();
		dos.close();
	}

}
