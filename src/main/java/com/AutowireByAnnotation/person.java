package com.AutowireByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class person {
	
	private String PersonName;
	private String PersonId;
	
	@Autowired
	@Qualifier("address2")   // bean name when required
	private Address address;
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public String getPersonId() {
		return PersonId;
	}
	public void setPersonId(String personId) {
		PersonId = personId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "person [PersonName=" + PersonName + ", PersonId=" + PersonId + ", address=" + address + "]";
	}
	
	
	
	

}
