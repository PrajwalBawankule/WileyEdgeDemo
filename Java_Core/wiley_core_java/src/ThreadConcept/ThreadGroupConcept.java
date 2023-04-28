package ThreadConcept;

class Demo implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		
	}
}
public class ThreadGroupConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadGroup tgParent = new ThreadGroup("Parent group");
		ThreadGroup tgChild1 = new ThreadGroup(tgParent, "Child Group");
		
		Thread t1 = new Thread(tgParent, new Demo(), "First");
		Thread t2 = new Thread(tgParent, new Demo(), "second");
		Thread t3 = new Thread(tgChild1, new Demo(), "Third");
		Thread t4 = new Thread(tgParent, new Demo(), "Fourth");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("Active groups of threads = "+ tgParent.activeCount());
		System.out.println("Active groups of threads = "+ tgChild1.activeCount());

		tgParent.list();
	}

}
