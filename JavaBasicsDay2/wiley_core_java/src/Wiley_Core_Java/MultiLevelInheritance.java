package Wiley_Core_Java;

class Vehicle{
	public void tyre() {
		System.out.println("Car move using tyre");
	}
	public void steering() {
	   System.out.println("Steering");
	}
}

class Car extends Vehicle{
	public void airbag() {
		System.out.println("Airbag");
	}
}
class SmartCar extends Car {
	public void sensor() {
		System.out.println("Sensor");
	}
}
public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		SmartCar sc = new SmartCar();
		sc.tyre();
		sc.steering();
		sc.airbag();
		sc.sensor();
	}
}
