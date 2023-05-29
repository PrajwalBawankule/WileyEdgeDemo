package com.wiley.springcore.misc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.ci.Person;

public class AwMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/wiley/springcore/misc/config.xml");

		Employee a1 = (Employee) context.getBean("employee", Employee.class);
		System.out.println(a1);
		
		a1.displayEmployee();
		
		SingletonA sa = context.getBean("prajwal",SingletonA.class);
		
		sa.getSingletonA();
		sa.sayHello();
		
	}

}
