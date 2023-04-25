package StringClasses;

public class StringProcess {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		String str = "I am Prajwal";
		String s = "Hello ";
				
		System.out.println(str.charAt(5));
		System.out.println(str.length());
		
		String str1 = s.concat(str);
		System.out.println(str1);
		
		System.out.println(str.replace("I","i"));
		
		String str2[] = str.split(" ");
		System.out.println(str2);
		for(String st: str2) {
			System.out.println(st);
		}
		String userinput = "     Mobile   ";
		System.out.println(userinput);
		System.out.println(userinput.trim());
		
		System.out.println(str.substring(3,9));
		System.out.println(str.toUpperCase());
	}
}
