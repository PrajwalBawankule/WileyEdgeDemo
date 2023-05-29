package com.wiley.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sob")
public class Student {

	@Value("Prajwal")
	private String studentname;
	
	@Value("Nagpur")
	private String city;
	
	@Value("#")
	private List<String> cities;
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String studentname, String city) {
		super();
		this.studentname = studentname;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", city=" + city + "]";
	}
	
}

