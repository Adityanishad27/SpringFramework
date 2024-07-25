package com.standaloneCollection;

import java.util.Map;
import java.util.Properties;

public class students {
	
	private Map<String , String> Courses;
	
	private Properties properties;
	

	public Map<String, String> getCourses() {
		return Courses;
	}

	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}

	public students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "students [Courses=" + Courses + ", properties=" + properties + "]";
	}

	
	
	
	

}
