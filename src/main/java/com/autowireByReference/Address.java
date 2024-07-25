package com.autowireByReference;

public class Address {
	

	private String City;
	private String State;
	private String country;
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
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", country=" + country + "]";
	}
	
	
	
	
	

}
