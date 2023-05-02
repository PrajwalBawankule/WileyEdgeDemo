package Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<String> pq = new PriorityQueue<>();
//
//		pq.add("f");
//		pq.add("a");
//		pq.add("b");
//		pq.add("c");
//		pq.add("d");
//		System.out.println(pq);
//		
//		//using linkedlist
//		Deque<String> dq = new LinkedList<>();
//
//		dq.add("a");
//		dq.addFirst("aa");
//		dq.add("a");
//		dq.add("a");
//		dq.addLast("bb");
//		dq.add("c");
//		
//		System.out.println(dq);
//		
//		dq.removeFirst();
//		System.out.println(dq);
//		
//		dq.removeLast();
//		System.out.println(dq);
		
		//Blocking queue interfave (Thread safe)
		BlockingQueue<String> bq = new LinkedBlockingDeque<>();
		bq.add("abc");
		bq.add("pqr");
	//	bq.add(null); //not allowed
		System.out.println(bq);
		

	}

}
