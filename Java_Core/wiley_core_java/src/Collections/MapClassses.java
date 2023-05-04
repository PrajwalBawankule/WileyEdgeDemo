package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapClassses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> hs = new HashMap<String,String>();
		hs.put("a", "A");
		hs.put("b", "B");
		hs.put("c", "C");
		hs.put(null, null);
		hs.put("d",null);
		hs.put(null,"nullval");
		hs.put("e", null);
		System.out.println(hs);
		
		HashMap<String,Integer> empid = new HashMap<>();
		empid.put("Prajwal", 1);
		empid.put("Ram", 2);
		empid.put("Raj", 3);
		
		System.out.println(empid);
		System.out.println(empid);
		System.out.println(empid.get("Prajwal"));
		System.out.println(empid.containsKey("Ris"));
		System.out.println(empid.containsValue(3));
	
		empid.put("Prajwal", 4);
		System.out.println(empid);
		empid.replace("Ram", 6);
		empid.putIfAbsent("Prajwal", 8);
		System.out.println(empid);
		
		empid.remove("Raj");
		System.out.println(empid);
		
		//LinkedHash Map
		Map myMap = new LinkedHashMap();
		myMap.put(1, 1);
		myMap.put(2, "A");
		myMap.put(null, "s");
		System.out.println(myMap);
	}

}
