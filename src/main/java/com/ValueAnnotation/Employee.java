package com.ValueAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("Aditya")
	private String EmpName;
	
	@Value("5555")
	private int EmpId;
	
	@Value("#{city}")
	private List<String> Empcity;
	
	public String getEmpName() {
		return EmpName;
	}
	
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public Employee() {
		super();
		
	}
	

	public List<String> getEmpcity() {
		return Empcity;
	}

	public void setEmpcity(List<String> empcity) {
		Empcity = empcity;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpId=" + EmpId + ", Empcity=" + Empcity + "]";
	}

	
	

}
