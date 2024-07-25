package com.collectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collectionType/CollectionType.xml");
		
		Employee  emp= context.getBean(Employee.class);
		
		
		System.out.println(emp.getEmpName());
		
		System.out.println(emp.getEmpPhones());
		System.out.println(emp.getEmpCourses());
		System.out.println(emp.getEmpAddress());
	}

}
