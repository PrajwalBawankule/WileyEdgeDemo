package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	List<String> list = new ArrayList(); //will give error when c added
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("a");
		list.add("b");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String e1 = itr.next();
			System.out.println(e1);
			list.add("c");
		}
		System.out.println(list);
	}

}
