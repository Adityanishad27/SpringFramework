package com.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class subjectMainApp {
	public static void main(String[] args) {
		
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/LifeCycle/LifeCycleConfig.xml");
	subject  sub= (subject)  context.getBean(subject.class);
	
	System.out.println(sub);
	context.registerShutdownHook();
	
	}

}
