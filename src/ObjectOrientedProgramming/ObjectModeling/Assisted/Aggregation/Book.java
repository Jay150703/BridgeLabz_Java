package ObjectOrientedProgramming.ObjectModeling.Assisted.Aggregation;

/*
 * Class: Book
 * Description: Represents a book that can exist
 * independently of a Library.
 */
public class Book {

    // Book title
    String title;

    // Book author
    String author;

    // Parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
