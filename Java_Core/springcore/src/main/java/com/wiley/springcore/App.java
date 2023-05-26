package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student wst1 =(Student)  context.getBean("wileystudent1");
        
        System.out.println(wst1);
        
        Student wst2 =(Student)  context.getBean("wileystudent2");
        System.out.println(wst2);
        
        StudentDesc wstd1 =(StudentDesc)  context.getBean("wileystudentdesc1");
        System.out.println(wstd1);
        
        
    }
}
