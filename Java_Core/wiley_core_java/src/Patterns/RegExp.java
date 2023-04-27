package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String re = ".."; //match exactly 2 character
		//String text = "aaa";
		
		
		//String re = "\\w\\w\\w\\W"; // (a-z,A-Z,0-9,_)  W - non word character
		//String text = "s_s@"; 
		
		//String re = "\\S\\s"; // s - one empty space  S - non empty space character 
		//String text = "a ";   
		
		String re = "\\d\\D"; d - digit single  D - non digit like symbols
		String text = "9a";
		
		Pattern pattern = Pattern.compile(re);
		Matcher mt = pattern.matcher(text);
		boolean res = mt.matches();
		System.out.println(res);
	}

}
