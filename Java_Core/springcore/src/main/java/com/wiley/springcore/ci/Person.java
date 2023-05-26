package com.wiley.springcore.ci;

public class Person {

	private int id;
	private String name;
	
	private Cert cert;
	public Person(int id, String name, Cert cert) {
		super();
		this.id = id;
		this.name = name;
		this.cert = cert;
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cert=" + cert + "]";
	}
	
}
