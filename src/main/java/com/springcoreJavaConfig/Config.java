package com.springcoreJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcoreJavaConfig")  // when we use bean tag then we want to remove this component scan 
public class Config {
	
	@Bean(name = {"stud","temp","students"})        // bean name  you can call any name                          // bean 
	public students getstudents() {
		// craeting students objects
		students student= new students();
		
		return student;
	}

}
