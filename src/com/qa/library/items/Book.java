package com.qa.library.items;

import com.qa.library.Item;

public class Book extends Item{

	private String author;
	
	public Book(String name, String author) {
		super(name);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", name=" + getName() + ", isCheckedIn=" + isCheckedIn() + "]";
	}

	@Override
	public String reading() {
		return "Enjoy your reading";
	}

}
