package com.autowireByReference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowireByReference/ByReferenceConfig.xml");
		
		Employee   emp= context.getBean(Employee.class);
		
		System.out.println(emp);
		
		
	}

}
