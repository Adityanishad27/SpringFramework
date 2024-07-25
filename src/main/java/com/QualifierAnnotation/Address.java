package com.QualifierAnnotation;

public class Address {
	
	private String StudentCity;
	private String StudentState;
	private String StudentCountry;
	
	
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	public String getStudentState() {
		return StudentState;
	}
	public void setStudentState(String studentState) {
		StudentState = studentState;
	}
	public String getStudentCountry() {
		return StudentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		StudentCountry = studentCountry;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [StudentCity=" + StudentCity + ", StudentState=" + StudentState + ", StudentCountry="
				+ StudentCountry + "]";
	}
	
	
	

}
