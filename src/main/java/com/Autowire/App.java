package com.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/Autowire/AutowireConfig.xml");
		Students s=(Students)context.getBean(Students.class);
		System.out.println(s);
		
	}

}
