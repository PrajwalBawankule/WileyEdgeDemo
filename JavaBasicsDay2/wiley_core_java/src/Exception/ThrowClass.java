package Exception;

public class ThrowClass {

	public static void method1() {
		try {
			method2();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
	
	public static void method2() throws InterruptedException {
		Thread t = new Thread();
		t.sleep(10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}

}
