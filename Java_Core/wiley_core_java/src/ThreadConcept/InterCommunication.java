package ThreadConcept;

class BankAccount{
	int amount = 1000;
	public synchronized void withdrawAmount(int amount) {
		System.out.println("Amount to withdraw = "+amount);
		System.out.println("Available balance = "+this.amount);
		if(this.amount < amount) {
			System.out.println("Amount is less by "+(amount-this.amount));
			
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Withdraw is successful");
		}
	}
	
	public synchronized void depositAmount(int amount) {
		this.amount+=amount;
		System.out.println("Amount deposited "+amount);
		System.out.println("Available balance = "+this.amount);
		notify();
	}
}
public class InterCommunication {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		
		Thread t1 = new Thread()
		{
			public void run() {
				ba.withdrawAmount(1500);
			}
		};
		Thread t2 = new Thread()
		{
			public void run() {
				ba.depositAmount(1000);
			}
		};		
		t1.start();
		t2.start();
	}

}
