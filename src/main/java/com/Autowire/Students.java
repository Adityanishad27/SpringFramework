package com.Autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Students {
	
	private String studentName;
	private String StudentGender;
	
	@Autowired
	private  Address  address;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGender() {
		return StudentGender;
	}
	public void setStudentGender(String studentGender) {
		StudentGender = studentGender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String studentName, String studentGender, Address address) {
		super();
		this.studentName = studentName;
		StudentGender = studentGender;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Students [studentName=" + studentName + ", StudentGender=" + StudentGender + ", address=" + address
				+ "]";
	}
	
	
	

}
