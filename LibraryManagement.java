package com.ajackus.libraryApp;

import java.util.Scanner;

public class LibraryManagement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BookManagement bookmanagement = new BookManagement();
		
		while(true) {
			System.out.println("LibraryManagementSystem");
			System.out.println("1. Add Book");
			System.out.println("2. Get All Books");
			System.out.println("3. Search Book");
			System.out.println("4. Update Book");
			System.out.println("5. Delete Book");
			System.out.println("6. Exit From System");
			
			int option = scanner.nextInt();
			scanner.nextLine();
			
			switch (option) {
			case 1:
				System.out.println("Enter Bookid: ");
				String bookid = scanner.nextLine();
				System.out.println("Enter Book Title: ");
				String title = scanner.nextLine();
				System.out.println("Enter Book Author: ");
				String author = scanner.nextLine();
				System.out.println("Enter Book Genre: ");
				String genre = scanner.nextLine();
				System.out.println("Enter Book Status: ");
				String status = scanner.nextLine();
				bookmanagement.addBook(new Book(bookid,title,author,genre,status));
				break;
			case 2:
				System.out.println("\nAll Books In Library: ");
				for(Book book:bookmanagement.getAllBooks()) {
					System.out.println(book);
				}
				break;
			case 3:
				System.out.println("Enter Bookid or book title to find specific book");
				String input = scanner.nextLine();
				Book book = bookmanagement.searchBook(input);
				System.out.println(book);
				break;
				
			case 4:
				System.out.print("Enter Book ID to Update: ");
                String bookId = scanner.nextLine();
                System.out.print("New Title: ");
                String newTitle = scanner.nextLine();
                System.out.print("New Author: ");
                String newAuthor = scanner.nextLine();
                System.out.print("New Availability Status: ");
                String newStatus = scanner.nextLine();
                boolean  updated = bookmanagement.updateBook(bookId, newTitle, newAuthor, newStatus);
                System.out.println(updated ? "Book updated successfully!" : "Book not found!");
                break;
            
            case 5:
                System.out.print("Enter Book ID to Delete: ");
                String Bookid = scanner.nextLine();
                boolean deleted = bookmanagement.deleteBook(Bookid);
                System.out.println(deleted ? "Book deleted successfully!" : "Book not found!");
            
            case 6:
                System.out.println("Exiting... Goodbye!");
                System.exit(0);
                break;
            
            default:
            	System.out.println("Invalid choice! Try again.");
			
				break;
			}
			
			
		}
		
	}
	
}
