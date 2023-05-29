package com.wiley.springcore.misc;

public class Student {

	//this is a factory method
	// a static factory method returns instance of its own class
	// it is used in singleton design pattern
	
	public static Student getStudentInfo() {
		return new Student();
	}
	
	// a non static factory method returns the instance of another class
	
	
}
