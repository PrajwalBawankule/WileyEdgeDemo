package Wiley_Core_Java;

public class ConstructorTypes {

	public ConstructorTypes(int a,int b) {
		System.out.println("2 args int count :"+(a+b));
	}
	
	public ConstructorTypes(float a,int b) {
		this(3,6); //prev constructor
		System.out.println("2 args int count :"+(a+b));
	}
	
	public ConstructorTypes() {
		System.out.println("No args constructor");
	}
	
	
	public void add() {
		
	}
	public static void main(String[] args) {
		ConstructorTypes ct = new ConstructorTypes();
		
		ConstructorTypes ctadd = new ConstructorTypes(3,4);
		
		ConstructorTypes ctaddf = new ConstructorTypes(3.2f,4);
	}
}
