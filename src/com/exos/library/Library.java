package com.exos.library;

import java.util.HashMap;
import java.util.Map;

public class Library {
	// Logique de l'application
	
	private Map<Book, Integer> books = new HashMap<>();
	
	//Constructor
	public Library() { } // Empty
	public Library(Map<Book, Integer> booksExisting) {
		books.putAll(booksExisting);
	}
	
	public void addBook(Book book, Integer qantity) {
		books.put(book, qantity);
	}

}
