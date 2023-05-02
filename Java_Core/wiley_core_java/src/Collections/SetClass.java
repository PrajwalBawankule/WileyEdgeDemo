package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("java");
		hs.add("Java");
		hs.add("JS");
		
		System.out.println(hs);
		
		Set<String> ts = new TreeSet<>();
		ts.add("Java");
		ts.add("java");
		ts.add("Java");
		ts.add("JS");
		ts.add("apple");
		System.out.println(ts);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("abc");
		arr.add("abc");
		arr.add("xyz");
		
		hs.addAll(arr);
		System.out.println(hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("p");
		lhs.add("q");
		lhs.add("r");
		lhs.add("s");
		lhs.add("t");
		System.out.println(lhs);
		lhs.remove("s");
		System.out.println(lhs);
	}

}
