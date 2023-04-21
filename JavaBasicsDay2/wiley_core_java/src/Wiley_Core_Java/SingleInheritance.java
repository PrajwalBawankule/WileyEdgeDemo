package Wiley_Core_Java;

class Animal{
	public void eat() {
		System.out.println("Eat..");
	}
	public void sleep() {
		System.out.println("Sleep..");
	}
}

class Lion extends Animal{
	public void roar() {
		System.out.println("Lion roars");
	}
}
public class SingleInheritance {
	
	public static void main(String[] args) {
		
		Lion l = new Lion();
		l.eat();
		l.sleep();
		l.roar();
	}

}
