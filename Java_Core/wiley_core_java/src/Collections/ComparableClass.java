package Collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass implements Comparator<Integer>{
	public int compare(Integer obj1, Integer obj2) {

		return obj1.compareTo(obj2);
//		if(obj1>obj2) {
//			return -1;
//		}
//		else if(obj1<obj2) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
	}
}
public class ComparableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TreeSet<Integer> ts = new TreeSet<>();
//		ts.add(21);
//		ts.add(3);
//		System.out.println(ts.first().compareTo(ts.last()));
	
		TreeSet<Integer> ss = new TreeSet<Integer>(new MyClass());
		ss.add(1);
		ss.add(4);
		ss.add(2);
		System.out.println(ss);
	}

}
