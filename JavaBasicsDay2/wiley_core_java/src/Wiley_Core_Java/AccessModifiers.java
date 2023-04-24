package Wiley_Core_Java;

class Access1{
	private String name = "Prajwal";
	protected int age = 12;
	int marks = 95;
	public String subject = "DBMS";
	
}
public class AccessModifiers {
	public static void main(String[] args) {
		Access1 a = new Access1();
		//System.out.println(a.name); //privste cannot be accessed
		System.out.println(a.age);
		System.out.println(a.marks);
		System.out.println(a.subject);
	}
	
	
}
