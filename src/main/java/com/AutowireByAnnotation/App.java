package com.AutowireByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
	
	
	ApplicationContext context= new ClassPathXmlApplicationContext("com/AutowireByAnnotation/ByAnnotation.xml");
	
	person p= context.getBean(person.class);
	
	System.out.println(p);
	
	
	
	}
	
}
