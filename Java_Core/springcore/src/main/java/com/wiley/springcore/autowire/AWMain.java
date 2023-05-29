package com.wiley.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.ci.Person;

public class AWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/autowireconfig.xml");
        
		  Emp a1 =  (Emp) context.getBean("emp1",Emp.class);
		  System.out.println(a1);
	}

}
