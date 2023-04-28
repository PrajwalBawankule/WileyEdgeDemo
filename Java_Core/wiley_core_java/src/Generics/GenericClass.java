package Generics;

import java.util.ArrayList;

public class GenericClass {

	public static void main(String[] args) {
//		Printer<Integer> printer = new Printer(27);
//		printer.print();
//		
//		Printer<Float> printer1 = new Printer(27.03f);
//		printer1.print();
//		
//		Printer<String> printer2 = new Printer("Hello World");
//		printer2.print();

//		Printer<Cat> printer = new Printer(new Cat());
//		printer.print();
//		Printer<Dog> printer1 = new Printer(new Dog());
//		printer1.print();
//		ArrayList<Object> cats = new ArrayList<>();
//		
//		cats.add(new Cat());
//		cats.add(new Cat());
//		cats.add(new Dog());
		
//		shout("Take me to movie");
//		shout(1000000);
//		shout(new Dog());
		
		shout("Amount", 2000);
		
	}
//	private static <T> void shout(T shoutOut) {
//		System.out.println(shoutOut + "..!!!");
//	}
	
	private static <T,V> void shout(T shoutOut,V valueToBring) {
		System.out.println(shoutOut + "..!!!");
		System.out.println(valueToBring + "..!!!");
	}
}
