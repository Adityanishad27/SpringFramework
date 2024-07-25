package com.ConstructorInjection;

public class Person {
	
	private String PersonName ;
	private   Certificate certi;
	public Person(String personName, Certificate certi) {
		super();
		PersonName = personName;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [PersonName=" + PersonName + ", certi=" + certi + "]";
	}

	
	

}
