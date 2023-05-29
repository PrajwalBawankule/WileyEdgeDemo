package com.wiley.springcore.config;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	public void study() {
		System.out.println("Student is studying");
		
	}
	
}

