# Library Management System

This is a simple **Java-based** Library Management System that allows librarians to efficiently manage books. It supports adding, updating, searching, and deleting books while maintaining their availability status.

## Features:
- Add a book with Book ID, Title, Author, Genre, and Availability Status.
- View a list of all books.
- Search books by ID or Title.
- Update book details (e.g., Availability Status, Title, or Author).
- Delete a book from the catalog.

## Setup and Running the Application

### Prerequisites:
- Java 8 or higher installed on your machine.
- A command-line interface (CLI) or IDE (e.g., IntelliJ IDEA, Eclipse).

### Steps to Run the Program:
1. Clone the repository:
    ```bash
    git clone https://github.com/KothaYashwini03/LibraryManagementSystem.git
    ```
2. Navigate to the project folder:
    ```bash
    cd LibraryManagementSystem
    ```
3. Compile the Java files:
    ```bash
    javac src/*.java
    ```
4. Run the application:
    ```bash
    java src.LibraryManagement
    ```

### Contribution:
If you'd like to contribute, feel free to open a pull request or create an issue.

---

## Challenges and Improvements:
### Challenges:
- **Case sensitivity**: Initially, the system did not handle case-insensitive comparisons for book IDs or titles. This was later improved by normalizing input to lowercase.
- **User input validation**: Handling empty or invalid inputs (e.g., for availability status) was challenging to handle consistently across different methods.
  
### Future Improvements:
- **Persistent Storage**: Integrating a database to persist data across different sessions instead of relying on in-memory storage.
- **GUI**: A graphical user interface would make the system more user-friendly.
- **Advanced Search**: Allowing partial text matching for searches or implementing regular expression-based searches.

