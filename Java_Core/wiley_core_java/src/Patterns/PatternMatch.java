package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pattern = Pattern.compile("wiley \\d\\d\\d");
		Matcher matcher = pattern.matcher("wiley 356 4");
		
		boolean f = matcher.find();
		boolean m = matcher.matches();
		
		System.out.println(f); //matches if the characters are present in string
		System.out.println(m); //matches exact pattern
	}

}
