package Collections;

import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(100, "Prajwal");
	
		tmap.put(104, "Parth");
		tmap.put(102, "Ram");
		tmap.put(107, "Raj");
		tmap.put(103, "Rohan");
		System.out.println(tmap); // ascending order sorted
		
		tmap.forEach((k,v) -> System.out.println("Key: "+k+" Value: "+v));
		
		System.out.println(tmap.lastKey());
		System.out.println(tmap.firstKey());
		
	}

}
