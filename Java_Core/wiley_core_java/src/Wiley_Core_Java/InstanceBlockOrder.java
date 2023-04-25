package Wiley_Core_Java;

public class InstanceBlockOrder {

	String name;
	int age;
	//Instance block runs each time when object is created
	{
		name = "Prajwal";
		age = 22;
		System.out.println("Instance Block");
	}
	
	public InstanceBlockOrder() {
		System.out.println("Name: "+name+" Age: "+age);
		System.out.println("constructor block");
	}
	
	public InstanceBlockOrder(int a,int b) {
		System.out.println("constructor parameterized "+(a+b));
	}
	
	public static void main(String[] args) {
		InstanceBlockOrder ibr = new InstanceBlockOrder();
		
		new InstanceBlockOrder(2,5);
		
	}
	
}
