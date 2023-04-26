package IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		Writer out = new OutputStreamWriter(System.out);
//		Writer fw = new FileWriter("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data4.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//		
//		bw.write("I am Programmer");
//		bw.flush();
//		bw.close();
//		fw.close();
		
		Reader r = new InputStreamReader("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\data4.txt");
		BufferedReader br = new BufferedReader(r);
		int j;

		while((j= br.read()) != -1){
		  System.out.print((char) j);	
		}
		r.close();
		br.close();
	}

}
