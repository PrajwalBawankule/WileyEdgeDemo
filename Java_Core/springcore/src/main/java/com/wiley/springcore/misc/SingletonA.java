package com.wiley.springcore.misc;

public class SingletonA {

	private static final SingletonA obj = new SingletonA();
	
	public SingletonA() {
		System.out.println("SingletonA object is created");
	}
	
	//factory method
	public static SingletonA getSingletonA() {
		return obj;
	}
	
	public void sayHello() {
		System.out.println("Sat hello to the employee");
	}
	
}
