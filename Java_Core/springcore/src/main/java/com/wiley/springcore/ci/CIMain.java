package com.wiley.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/ci/ciconfig.xml");
	        
		  Person p1 = (Person) context.getBean("p1");
		  System.out.println(p1);
	}

}
