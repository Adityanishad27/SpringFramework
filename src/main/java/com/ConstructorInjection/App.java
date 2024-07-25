package com.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/ConstructorInjection/ConstructorInj_Config.xml");
		
	Person p=(Person)	context.getBean(Person.class);
	System.out.println(p);
		
	}

}
