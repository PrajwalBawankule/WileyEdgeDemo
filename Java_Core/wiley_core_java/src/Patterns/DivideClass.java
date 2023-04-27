package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pattern = Pattern.compile("^(\\d+) divided by (\\d+)$");
		Matcher matcher = pattern.matcher("10 divided by 2");
		
		if(matcher.find()) {
			String simplifiedMsg = "result = "+matcher.replaceFirst("$1/$2");
			System.out.println(simplifiedMsg);
			int res = Integer.valueOf(matcher.group(1))/Integer.valueOf(matcher.group(2));
			System.out.println("Final Result = "+res);
			
			
		}
		
	}

}
