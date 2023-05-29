package com.wiley.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.ci.Person;

public class ConfigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student student = con.getBean("getStudent",Student.class);
		
		System.out.println(student);
		
        student.study();
        
	}

}
