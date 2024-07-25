package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Students {
	private int StudentId;
	private String   studentName;
	private  int studentAge;
	
	@Autowired
	private  Address address;
	
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	
	
	@Override
	public String toString() {
		return "Students [StudentId=" + StudentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", address=" + address + "]";
	}
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Students(int studentId, String studentName, int studentAge, Address address) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
	}
	
	
	
	
	

}
