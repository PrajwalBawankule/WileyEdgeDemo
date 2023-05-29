package com.wiley.springcore.misc;

import javax.annotation.Resource;

public class Employee {


	private String name;
	
	@Resource
	private  Address address;
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public void displayEmployee() {
		System.out.println("Employee details : ");
	}
	
	
}
