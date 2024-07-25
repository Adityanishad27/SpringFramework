package com.AmbiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/AmbiguityProblem/AmbiguityProblem.xml");
		
		Addition   add= (Addition) context.getBean(Addition.class);
		
		add.doSum();
		
	}

}
