package com.BeanScopeBYAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")   // by default Singleton hota 
public class students {
	@Value("Aditya Nishad")
	private String StudentName;
	
	@Value("3636")
	private int StudentId;
	@Value("#{Address}")
	private List<String> Address;

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

	public List<String> getAddress() {
		return Address;
	}

	public void setAddress(List<String> address) {
		Address = address;
	}

	public students() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "students [StudentName=" + StudentName + ", StudentId=" + StudentId + ", Address=" + Address + "]";
	}
	
	
	
	

}
