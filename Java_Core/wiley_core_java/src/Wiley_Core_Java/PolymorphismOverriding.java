package Wiley_Core_Java;

class X{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}

class Y extends X{
	public void add(int a,int b) {
		System.out.println("Sum is = "+(a+b));
	}
}
public class PolymorphismOverriding {
	
	public static void main(String[] args) {
		Y y = new Y();
	y.add(2, 3);
	X x = new X();
	x.add(2, 3);
	}
}
