package Wiley_Core_Java;

public class VarScope {
	
	int ins = 10; //instance variable
	static String name = "Prajwal";
	int val = 18;
	int val1 = 12;
	
	public void add() {
		int val = 10;
		int val1 = 25;
		System.out.println("Sum = "+(val+val1));
		
		System.out.println("Sum = "+(this.val + this.val1));
	}
	public static void main(String[] args) {
		
		int loc = 10; //local variable
	
		VarScope v = new VarScope();
		
		System.out.println("Local variable = "+loc);
		
		System.out.println("Instance variable = "+v.ins);
		
		System.out.println("Static variable name = "+name);
		
		v.add();
		
	}
}
