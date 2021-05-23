package com.qa.library;

public class Person {

	private boolean isRegistered;
	private String name;
	
	public Person(boolean isRegistered, String name) {
		super();
		this.isRegistered = isRegistered;
		this.name = name;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [isRegistered=" + isRegistered + ", name=" + name + "]";
	}
	
}
