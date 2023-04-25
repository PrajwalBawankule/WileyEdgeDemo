package StringClasses;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("I am Prajwal");
		System.out.println(s.countTokens());
		
		while(s.hasMoreElements()) {
			System.out.println(s.nextToken());
		}
		
		StringTokenizer st = new StringTokenizer("I:am:Praju",":");
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
	}
}
