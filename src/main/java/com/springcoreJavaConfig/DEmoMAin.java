package com.springcoreJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DEmoMAin {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		
	students  stud=	context.getBean("getstudents",students.class);
	
	
	stud.studying();
	
	}

}
