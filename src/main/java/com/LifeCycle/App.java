package com.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/LifeCycle/LifeCycleConfig.xml");
		
		Samosa sam=(Samosa) context.getBean(Samosa.class);
		
		System.out.println(sam);
		
		
		// Registering  ShutdownHook to  Destroy method
		context.registerShutdownHook();
		
		System.out.println("________________________________________________________________________________________");
		
		Pepsi pepsi= context.getBean(Pepsi.class);
		System.out.println(pepsi);
		
		context.registerShutdownHook();
		
		
		
		
	}

}
