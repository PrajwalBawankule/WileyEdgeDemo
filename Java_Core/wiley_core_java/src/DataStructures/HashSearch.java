package DataStructures;

import java.util.HashMap;

public class HashSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hs = new HashMap<>();
		
		hs.put("Prajwal", 12);
		hs.put("Rahul", 13);
		hs.put("Rohan", 14);
		hs.put("Prem", 15);
		
		String s = "Rohan";
		
		if(hs.containsKey(s)) {
			int val = hs.get(s);
			System.out.println("Value of "+s+" found "+val);
		}
		else {
			System.out.println("Not present");
		}
		
	}

}
