package com.qa.library;

import com.qa.library.interfaces.Readable;

public abstract class Item implements Readable {
	
	private static int count = 0;
	private int id;
	private String name;
	private boolean isCheckedIn;
//	public abstract String reading();
	
	public Item() {
		this("Unknown");
	}
	
	public Item(String name) {
		super();
		this.id = ++count;
		this.name = name;
		this.isCheckedIn = false;
	}

	public String getName() {
		return name;
	}

	// Overload Example
	public void setName() {
		this.name = "unknown";
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean isCheckedIn() {
		return isCheckedIn;
	}

	public void setCheckedIn(boolean isCheckedIn) {
		this.isCheckedIn = isCheckedIn;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", isCheckedIn=" + isCheckedIn + "]";
	}
	
}
