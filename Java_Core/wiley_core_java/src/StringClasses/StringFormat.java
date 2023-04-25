package StringClasses;

import java.util.Arrays;
import java.util.List;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title = "Web Developer";
		float salary = 20000.34f;
		System.out.format("%s has %.1f Rs. salary", title,salary);

		List<String> l = Arrays.asList(
				"Java",
				"Python",
				"C++",
				"Data Structures"
				);
		
		for(String book : l) {
			System.out.format("%-30s - In stock%n",book);
		}
	}

}
