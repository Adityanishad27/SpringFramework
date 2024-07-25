package com.BeanScopeBYAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// bean scope by annotation  
// singleton = ek he object baar baar return karega 
// prototype  = 


public class App {
	public static void main(String[] args) {
		
		
		ApplicationContext context= new  ClassPathXmlApplicationContext("com/BeanScopeBYAnnotation/ScopeConfig.xml");
		
		//  student1 
	     students stud1  =	context.getBean(students.class);
	     System.out.println(stud1.hashCode());
		
	     // student2
	     
	     
	     students stud2 =	context.getBean(students.class);
	     System.out.println(stud2.hashCode());
		
	     // same object print 
	     
	     
	     
	}

}
