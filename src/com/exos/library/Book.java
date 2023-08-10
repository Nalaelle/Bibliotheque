package com.exos.library;

public abstract class Book {
	
	private String author;
	private String title;
	private Boolean available;
	private int date;
	
	public Book (String author, String title, Boolean available, int date) {
		this.author = author;
		this.title = title;
		this.available = available;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return ("Author : " + author 
				+ " - Title : " + title
				+ " - Available : "+ available
				+ " - Date : " + date
				);
	}

}
