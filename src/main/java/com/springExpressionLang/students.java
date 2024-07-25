package com.springExpressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class students {
	@Value("#{22+33}")
	private int x;
	
	@Value("#{33+33}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")   // sqrt of 144
	private double z;    // invoke static method  variables and creating objects
	
	
	
	@Value("#{T(java.lang.Math).E}")  // value of E   invoke static  by java.lang.Math class 
	private double  e;
	
	@Value("#{T(java.lang.Math).PI}")  // value of Pi
	private double  PI;
	
	
	@Value("#{new  java.lang.String ('Aditya Nishad')}")
	private  String name ;                                  // creating objects
	
	
	@Value("#{8>3}")
	  private boolean isActive;     // Boolean Expression Language
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "students [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", PI=" + PI + ", name=" + name
				+ ", isActive=" + isActive + "]";
	}
	
	
	
	
	
	
	
	

}
