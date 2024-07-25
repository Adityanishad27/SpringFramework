package com.spring;

public class Address {
	
	private String  studentCity;
	private String StudentState;
	private String StudentCountry;
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
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
	public Address(String studentCity, String studentState, String studentCountry) {
		super();
		this.studentCity = studentCity;
		StudentState = studentState;
		StudentCountry = studentCountry;
	}
	@Override
	public String toString() {
		return "Address [studentCity=" + studentCity + ", StudentState=" + StudentState + ", StudentCountry="
				+ StudentCountry + "]";
	}
	
	

}
