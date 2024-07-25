package com.Autowire;

public class Address {
	
	private String City;
	private String State;
	private String Country;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Address(String city, String state, String country) {
		super();
		City = city;
		State = state;
		Country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Country=" + Country + "]";
	}
	
	

}
