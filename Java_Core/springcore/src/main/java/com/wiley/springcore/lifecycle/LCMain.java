package com.wiley.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/lifecycle/configpizza.xml");
	     
		 Pizza pz1 = (Pizza) context.getBean("pizza1");
		 System.out.println(pz1);
		 
		 context.registerShutdownHook();
	}

}
