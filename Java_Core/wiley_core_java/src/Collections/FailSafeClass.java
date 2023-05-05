package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map<Integer,String> myMap = new HashMap<>();
		Map<Integer,String> myMap = new ConcurrentHashMap<>();
		myMap.put(1,"Java");
		myMap.put(2, "Python");
		
		Iterator it = myMap.keySet().iterator();
		
		//mod count =0 +1
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Key: "+myMap.get(key));
			myMap.put(3, "C");
		}
	}

}
