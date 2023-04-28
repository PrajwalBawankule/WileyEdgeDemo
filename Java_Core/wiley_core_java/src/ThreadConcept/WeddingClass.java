package ThreadConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
		// Fixed Size Thread Pool
		// ExecutorService executor = Executors.newFixedThreadPool(4);
		
		//cached thread pool
//		ExecutorService executor = Executors.newCachedThreadPool();
//		for(int i=1; i<=100; i++) {
//			executor.execute(new WeddingCardWrap());
//		}
//		
		//scheduled thread pool
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
	//	executor.schedule(new WeddingCardWrap(),2, TimeUnit.SECONDS);	
//		executor.scheduleAtFixedRate(new WeddingCardWrap(), 10, 2, TimeUnit.SECONDS);
		executor.scheduleWithFixedDelay(new WeddingCardWrap(), 5, 2, TimeUnit.SECONDS);
		
	}

}
