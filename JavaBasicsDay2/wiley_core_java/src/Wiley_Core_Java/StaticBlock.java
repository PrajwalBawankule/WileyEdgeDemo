package Wiley_Core_Java;

public class StaticBlock {
	
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}

	public StaticBlock() {
		System.out.println("Inside constructor block");
	}
	public static void main(String[] args) {
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
	}
}
