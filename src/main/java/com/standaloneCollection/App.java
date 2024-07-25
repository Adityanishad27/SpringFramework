package com.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/standaloneCollection/StandAloneCollection.xml");
		
		Person p=context.getBean(Person.class);
		
		System.out.println(p);
		
		System.out.println(p.getFriends().getClass().getName());  // To know the list such as Linked list or vector list or Array list
		
		System.out.println("___________________________________________________________");
		
		
		
		students s= context.getBean(students.class);
		System.out.println(s);
		
		System.out.println("___________________________________________________________");
		System.out.println(s.getProperties());
		
	}

}
