package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "The quick way to learn programming is consistent practice";
		
		Pattern p = Pattern.compile("learn");
		Matcher m = p.matcher(input);
		//System.out.println(m.find());
		
		String input1 = "The quick way to learn programming is consistent practice";
		Pattern p1 = Pattern.compile("LEARN",Pattern.CASE_INSENSITIVE);
		Matcher m1 = p1.matcher(input1);
		
		if(m.find()) {
			int start = m.start();
			int end = m.end();
			System.out.println("Found match from "+start+" end at "+(end-1));
		}
	}

}
