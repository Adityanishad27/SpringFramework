package com.QualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class students {
	
	private String StudentName;
	private  int StudentId;
	
	
	@Autowired
	@Qualifier("address")
	private Address address;
	
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "students [StudentName=" + StudentName + ", StudentId=" + StudentId + ", address=" + address + "]";
	}
	

}
