package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class CursorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vc = new Vector<>();
		vc.addElement("a");
		vc.addElement("a");
		vc.addElement("c");
		vc.addElement("c");
		vc.addElement("d");
		vc.addElement("d");
		
//		Enumeration<String> ev = vc.elements();
//		while(ev.hasMoreElements()) {
//			System.out.println(ev.nextElement());
//		}
		
		Iterator itr = vc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		ListIterator<Integer> li =arr.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		LinkedList<String> l = new LinkedList<>();
		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");
		ListIterator<String> li2 = l.listIterator();
		while(li2.hasNext()) {
			System.out.println(li2.next());
		}
		
	}

}
