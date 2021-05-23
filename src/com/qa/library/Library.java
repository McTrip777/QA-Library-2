package com.qa.library;

import java.util.*;

// Garage 
public class Library {

	List<Item> itemList;
	List<Person> personList;

	public Library() {
		super();
		this.itemList = new ArrayList<>();
		this.personList = new ArrayList<>();
	}

	public void addItem(Item i) {
		i.setCheckedIn(true);
		itemList.add(i);
	}
	
	public void removeItem(Item i) {
		i.setCheckedIn(false);
		itemList.remove(i);
	}
	
	public void removeAllItems() {
		itemList.clear();
	}
	
	// Person Methods
	public void addPerson(Person i) {
		personList.add(i);
	}
	
	public void removePerson(Person i) {
		personList.remove(i);
	}
	
	public void removeAllPersons() {
		personList.clear();
	}

	public String toStringItems() {
		return "itemList=" + itemList;
	}
	
	public String toStringPersons() {
		return "personList=" + personList;
	}
	
	@Override
	public String toString() {
		return "Library [itemList=" + itemList + " personList=" + personList + "]";
	}
	
}
