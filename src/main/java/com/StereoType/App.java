package com.StereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/StereoType/StereoTypeConfig.xml");
		
	students stud= context.getBean(students.class);
		
		System.out.println(stud);
	}

}
