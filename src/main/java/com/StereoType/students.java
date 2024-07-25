package com.StereoType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


// value Annotation
//@component("Object name declare")   kar skate 
@Component
public class students {
	
	@Value("353")
	private int StudentId;
	@Value("Aditya Nishad")
	private String StudentName;
	@Value("23")
	private String StudentAge;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(String studentAge) {
		StudentAge = studentAge;
	}
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "students [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAge=" + StudentAge + "]";
	}
	
	

}
