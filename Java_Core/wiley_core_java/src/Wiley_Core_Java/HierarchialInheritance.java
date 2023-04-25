package Wiley_Core_Java;

class Vehicle1{
	public void steering() {
	   System.out.println("Steering");
	}
}

class Car1 extends Vehicle1{
	public void airbag() {
		System.out.println("Airbag");
	}
}

class Truck extends Vehicle1{
	public void hydraulicPump() {
		System.out.println("Hydraulic Pump");
	}
}

public class HierarchialInheritance {
	
	public static void main(String[] args) {
		
		Car1 c = new Car1();
		c.steering();
		c.airbag();
		
		Truck t = new Truck();
		t.steering();
		t.hydraulicPump();
		
	}
}
