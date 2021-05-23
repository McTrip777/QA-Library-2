package com.qa.library.start;

import com.qa.library.Library;
import com.qa.library.Person;
import com.qa.library.items.Book;
import com.qa.library.items.Map;

public class Runner {

	public static void main(String[] args) {
		boolean bool = false;
		do{
			
			Book b = new Book("Narnia", "C.S. Lewis");
			Map m = new Map("Tresure Map", true);
//			System.out.println(b.reading());
//			System.out.println(m.reading());
			Person josh = new Person(true, "Josh");
			Person rawr = new Person(false, "Rawr");
			Library l = new Library();
			l.addItem(b);
			l.addItem(m);
			l.addPerson(josh);
			l.addPerson(rawr);
			rawr.setName("Lion");
//			l.removePerson(josh);
//			l.removeAllPersons();
			
			m.setCheckedIn(true);
			
//			System.out.println(m);
			System.out.println(l.toStringPersons());
			System.out.println(l.toStringItems());
			
		}
		while(bool);
	}

}
//At least one Abstract Class must be implemented.
//At least one Interface Class must be implemented.
//Each item should have at least 1 additional attribute unique to itself.
//Method Overloading implemented.
//Correct usage of access modifiers
//Naming conventions adhered too
//Commenting only where necessary.
//At least 2 of the following items:
//a.    Books
//b.    Maps 
//c.    Government documents
//d.    Media resources (Camera etc.)
//e.    Newspapers
//f.    Journals
//g.    Magazines
//h.    Dissertations
//i.    Theses

// Library -> List(Items) : checking in and out items
//ALL of the following:
//a.    Check out item
//b.    Check in item
//c.    Add item
//d.    Remove item
//e.    Update item

// Person Class
//f.    Register person
//g.    Delete person
//h.    Update person
// 
//Implement an ID system in your library project, utilizing a static integer variable.
