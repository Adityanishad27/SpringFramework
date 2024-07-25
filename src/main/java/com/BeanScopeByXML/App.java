package com.BeanScopeByXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/BeanScopeByXML/ScopeXMLconfig.xml");
	
		
		//student1
	students stud1=	context.getBean(students.class);
	System.out.println(stud1.hashCode());
	
	//student2
	students stud2=	context.getBean(students.class);
	System.out.println(stud2.hashCode());
	
		
	}

}
