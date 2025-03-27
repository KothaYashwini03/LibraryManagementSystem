package com.ajackus.libraryApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookManagement {
	private final List<Book> books = new ArrayList<Book>();
	
	//Add books to collection
    public void addBook(Book book) {
    	  // Validate new Title-cannot be empty if provided
        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            System.err.println("Error: Title cannot be empty.");
            return;
        }
        // Validate new Author-cannot be empty if provided
        if (book.getAuthor() == null || book.getAuthor().trim().isEmpty()) {
            System.err.println("Error: Author cannot be empty.");
            return;
        }

        // Validate Availability Status
        if (!book.getAvailabilityStatus().equals("Available") && !book.getAvailabilityStatus().equals("Checked Out")) {
            System.err.println("Error: Availability status must be 'Available' or 'Checked Out'.");
            return;
        }

        // Check if the book ID already exists
        for (Book existingBook : books) {
            if (existingBook.getBookId().equals(book.getBookId())) {
                System.err.println("Error: Book ID already exists.");
                return;
            }
        }

        // Add the book to the collection
        books.add(book);
    }
	
	//Get all books
	public List<Book> getAllBooks(){
		return books;
	}
	
	//Search book by using book id or book title
	public Book searchBook(String input) {
		Iterator<Book> iterator = books.iterator();
		
		while(iterator.hasNext()) {
			Book book = iterator.next();
			
			//Checks if book id or book title matches the parameter input
			if(input.equals(book.getBookId()) || input.equals(book.getTitle())){
				return book; //returns the book that matches either book id or book title
			}
		}
		return null; //if book is not found
	}
	
	
	//Update book using book id(book id is unique)
	public boolean updateBook(String bookId, String newTitle, String newAuthor, String newStatus) {
	    for (Book book : books) {
	    	
	        if (bookId.equals(book.getBookId())) { 
	            
	            // Validate new Title-cannot be empty if provided
	            if (newTitle != null) {
	                if (newTitle.trim().isEmpty()) {
	                    System.err.println("Title cannot be empty.");
	                    return false;
	                }
	                book.setTitle(newTitle);
	            }

	            // Validate new Author-cannot be empty if provided
	            if (newAuthor != null) {
	                if (newAuthor.trim().isEmpty()) {
	                    System.err.println("Author cannot be empty.");
	                    return false;
	                }
	                book.setAuthor(newAuthor);
	            }

	            // Validate Availability Status-must be Available or Checked Out
	            if (newStatus != null) {
	                if (!newStatus.equals("Available") && !newStatus.equals("Checked Out")) {
	                    System.err.println("Invalid status. It must be 'Available' or 'Checked Out'.");
	                    return false;
	                }
	                book.setAvailabilityStatus(newStatus);
	            }

	            return true; // Book updated successfully
	        }
	    }
	    System.out.println("Book not found.");
	    return false;
	}

	
	//Delete book using bookid
	public boolean  deleteBook(String bookid) {
		Iterator<Book> iterator = books.iterator();
		
		while(iterator.hasNext()) {
			Book book = iterator.next();
			if(bookid.equals(book.getBookId())) {
				iterator.remove(); //removes if bookid as same as the input parameter
				return true;
			}
		}
				
		return false;
	}
	
}
