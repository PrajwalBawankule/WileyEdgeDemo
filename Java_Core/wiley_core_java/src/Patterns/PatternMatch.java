package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pattern = Pattern.compile("wiley");
		Matcher matcher = pattern.matcher("wiley");
		
		boolean f = matcher.find();
		System.out.println(f);
	}

}
