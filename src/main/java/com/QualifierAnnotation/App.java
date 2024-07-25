package com.QualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext  context= new ClassPathXmlApplicationContext("com/QualifierAnnotation/QualifireAnnotationConfig.xml");
		
		
	students studd=	context.getBean(students.class);
		
	System.out.println(studd);
	}

}
