package Collections;

import java.util.TreeSet;

public class SetClassses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<>();
		ts.add("s");
		ts.add("a");
		ts.add("n");
		ts.add("t");
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("n")); // <n
		System.out.println(ts.tailSet("n"));  // >=n
		System.out.println(ts.subSet("a", "t"));  // >=a and < t
		System.out.println(ts.descendingSet());
		
		
	}

}
