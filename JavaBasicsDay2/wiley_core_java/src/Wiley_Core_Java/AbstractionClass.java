package Wiley_Core_Java;

abstract class Test1{
	public abstract void m1();
	
	{  //Instance Block
		System.out.println("Test1 instance block");
	}
	static{  //Static Block executes only once 
		System.out.println("Test1 static block");
	}
	public void m2() {
		System.out.println("Test1 m2 method");
	}
	
	public static void main(String[] args) {
		System.out.println("Test1 main method from abstract class");
	}
	
	public Test1() {
		System.out.println("Test 1 constructor");
	}
}

class Test2 extends Test1{

	{
		System.out.println("Test2 instance block");
	}
	
	static{  //Static Block executes only once 
		System.out.println("Test2 static block");
	}
	
	public void m1() {
		System.out.println("Test2 m1 method");
	}
	
	public Test2() {
		System.out.println("Test 2 constructor");
	}
	
}

public class AbstractionClass {
	
	public static void main(String[] args) {
	   Test2 t2 = new Test2();
	   t2.m1();
	   t2.m2();
	   Test1.main(args);
	}
}
