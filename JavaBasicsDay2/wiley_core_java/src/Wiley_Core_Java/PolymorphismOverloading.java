package Wiley_Core_Java;

class Add{
	public void add(int a, int b) {
		System.out.println("Sum ="+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("Sum float = "+(a+b));
	}
}
public class PolymorphismOverloading {
	public static void main(String[] args) {
		Add a = new Add();
		a.add(2,3);
		a.add(2.3f, 4.5f);
	}
}
