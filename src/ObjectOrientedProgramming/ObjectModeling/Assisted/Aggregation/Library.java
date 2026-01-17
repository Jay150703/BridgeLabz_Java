package ObjectOrientedProgramming.ObjectModeling.Assisted.Aggregation;

import java.util.ArrayList;

/*
 * Class: Library
 * Description: A Library aggregates multiple Book objects.
 */
public class Library {

    // Library name
    String libraryName;

    // Collection of books
    ArrayList<Book> books = new ArrayList<>();

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Add book to library
    void addBook(Book book) {
        books.add(book);
    }

    // Display library books
    void displayBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
    }

    public static void main(String[] args) {
        // Creating books independently
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("OOPS Concepts", "Herbert");

        // Creating libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Aggregating books
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b1); // Same book in another library

        lib1.displayBooks();
        lib2.displayBooks();
    }
}
