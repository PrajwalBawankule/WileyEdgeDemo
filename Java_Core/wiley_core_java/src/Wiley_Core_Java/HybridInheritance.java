package Wiley_Core_Java;

class A{
	public void a1() {
		System.out.println("Hello from A");
	}
}

class B extends A{
	public void b1() {
		System.out.println("Hello from B");
	}
}
class C extends A{
	public void c1() {
		System.out.println("Hello from C");
	}
}

class D extends B{
	public void d1() {
		System.out.println("Hello from D");
	}
}
class E extends D{
	public void e1() {
		System.out.println("Hello from E");
	}
}
public class HybridInheritance {
	
	public static void main(String[] args) {
		
		B b = new B();
		b.a1();
		b.b1();
		System.out.println("");
		C c = new C();
		c.a1();
		c.c1();
		System.out.println("");
		D d = new D();
		d.a1();
		d.b1();
		d.d1();
		System.out.println("");
		E e = new E();
		e.a1();
		e.b1();
		e.d1();
		e.e1();
	}
}
