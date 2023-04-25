package Wiley_Core_Java;

class Test{
	public static int add1(int v1, int v2) {
		int v = v1+v2;
		return v;
	}
}
public class MethodType {
	
	public void sub(int a,int b) {
		int r = a-b;
		System.out.println("Subtraction in instance method = "+r);
	}
	public void add(int a,int b) {
		int r = a+b;
		System.out.println("Sum in instance method = "+r);
		this.sub(12, 4);
		
	}
	
	public static void sum(int a,int b) {
		int r = a+b;
		System.out.println("Add in static method = "+r);
	}
	public static int sum1(int a,int b) {
		int r = a+b;
		return r;
	}
	public static void main(String[] args) {
		
		sum(10,3);
		int res = sum1(2,4);
		System.out.println("Sum using static return type = "+res);
		MethodType m = new MethodType();
		m.add(2, 3);
		
		int ad = Test.add1(2,4);
		System.out.println("Calling static method from another class sum = "+ad);
		
	}

}
