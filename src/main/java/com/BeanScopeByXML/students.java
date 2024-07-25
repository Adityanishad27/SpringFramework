package com.BeanScopeByXML;

public class students {
	
	private String  StudentName;
	private  int StudentId;
	private String studentAddress;
	
	
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
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "students [StudentName=" + StudentName + ", StudentId=" + StudentId + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
	
	
	

}
