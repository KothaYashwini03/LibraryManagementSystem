package com.ajackus.libraryApp;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private String genre;
	private String availabilityStatus;
	
	
	//Constructor
	public Book(String bookId, String title, String author, String genre, String availabilityStatus) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.availabilityStatus = availabilityStatus;
	}

	//Getters and Setters
	public String getBookId() {
		return bookId;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getAvailabilityStatus() {
		return availabilityStatus;
	}


	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", genre=" + genre
				+ ", availabilityStatus=" + availabilityStatus + "]";
	}	
	
}
