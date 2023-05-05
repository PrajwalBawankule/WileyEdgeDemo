package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuiltInPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> checkLength = (String str) -> str.length() == 4;

		List<String> fi = Arrays.asList("Java", "Python", "C", "C++");

		fi.forEach(l -> {
			if(checkLength.test(l)) {
				System.out.println(l);
			}
		});
	}

}
