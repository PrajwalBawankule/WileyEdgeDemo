package Wiley_Core_Java;

abstract class Test1{
	public abstract void m1();
	
	public void m2() {
		System.out.println("Test1 m2 method");
	}
}

class Test2 extends Test1{

	public void m1() {
		System.out.println("Test2 m1 method");
		
	}
	
}

public class AbstractionClass {
	
	public static void main(String[] args) {
	   Test2 t2 = new Test2();
	   t2.m1();
	   t2.m2();
	}
}
