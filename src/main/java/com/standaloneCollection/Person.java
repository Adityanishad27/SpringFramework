package com.standaloneCollection;

import java.util.List;

public class Person {
	private List<String> Friends;

	public List<String> getFriends() {
		return Friends;
	}

	public void setFriends(List<String> friends) {
		Friends = friends;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [Friends=" + Friends + "]";
	}
	
	
	
	

}
