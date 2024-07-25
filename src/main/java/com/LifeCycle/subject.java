package com.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



// init and destroy Method using  Annotation  @PostConstruct to init method  and  @PreDestroy  destroye method

public class subject {
	
	private String Course;

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "subject [Course=" + Course + "]";
	}
	
	@PostConstruct
	public void start() {
		
		System.out.println(" start  ==init using annotation");
		
	}
	
	@PreDestroy
	public void end() {
		
		System.out.println("end == destroye using annotation");
		
	}

}
