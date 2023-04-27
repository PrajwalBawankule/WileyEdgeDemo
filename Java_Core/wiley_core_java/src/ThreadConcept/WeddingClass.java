package ThreadConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WeddingCardWrap extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread name :- "+Thread.currentThread().getName());
		
	}
}
public class WeddingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ExecutorService executor = Executors.newFixedThreadPool(4);
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i=1; i<=100; i++) {
			executor.execute(new WeddingCardWrap());
		}
		
	}

}
