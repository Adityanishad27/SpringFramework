package com.collectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String EmpName ;
	private List<String> EmpPhones;
	private Set<String>  EmpAddress;
	private Map<String, String> EmpCourses;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getEmpPhones() {
		return EmpPhones;
	}
	public void setEmpPhones(List<String> empPhones) {
		EmpPhones = empPhones;
	}
	public Set<String> getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		EmpAddress = empAddress;
	}
	public Map<String, String> getEmpCourses() {
		return EmpCourses;
	}
	public void setEmpCourses(Map<String, String> empCourses) {
		EmpCourses = empCourses;
	}
	public Employee(String empName, List<String> empPhones, Set<String> empAddress, Map<String, String> empCourses) {
		super();
		EmpName = empName;
		EmpPhones = empPhones;
		EmpAddress = empAddress;
		EmpCourses = empCourses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpPhones=" + EmpPhones + ", EmpAddress=" + EmpAddress
				+ ", EmpCourses=" + EmpCourses + "]";
	}
	
	

}
