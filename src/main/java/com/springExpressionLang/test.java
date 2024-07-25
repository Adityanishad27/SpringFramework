package com.springExpressionLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext context=  new ClassPathXmlApplicationContext("com/springExpressionLang/springExpressionConfig.xml");
		
	students stud =	context.getBean("students",students.class);
		
		System.out.println(stud);
		
	}

}
