package ThreadConcept;

public class DeadlockConcept {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static class LockThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized(Lock1) {
				System.out.println("Thread 1 hold lock 1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Thread 1 is waiting for lock 2");
			
			synchronized(Lock2) {
				System.out.println("Thread 1 hold lock 2");
			}
		}
	}
}
