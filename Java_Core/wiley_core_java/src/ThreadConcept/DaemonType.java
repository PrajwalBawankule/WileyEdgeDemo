package ThreadConcept;

class SupportClass extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is a Daemon thread");
		} else {

			System.out.println("This is not a Daemon thread");
		}
	}
}
public class DaemonType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SupportClass t1 = new SupportClass();
		SupportClass t2 = new SupportClass();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}

}
