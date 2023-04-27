package ThreadConcept;

class TPriority extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println(
					"Thread Name : - "+Thread.currentThread().getName() + 
					"   Thread Priority : - "+ Thread.currentThread().getPriority()
					);
		}
	}
}
public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Thread.currentThread().setPriority(6);
//		System.out.println("Main thread :- "+Thread.currentThread().getPriority());
//		TPriority t1 = new TPriority();
//		t1.setPriority(10);
//		TPriority t2 = new TPriority(); //t2 is also assigned the priority of 6 as we have set the main thread priority as 6
		
		TPriority t1 = new TPriority();
		TPriority t2 = new TPriority();
		TPriority t3 = new TPriority();
		
		t1.setName("First thread");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t1.start();
		t1.join(10);
		System.out.println(t1.getState());
		t2.start();
		t2.join();
		System.out.println(t2.getState());
		t3.start();
	}

}
