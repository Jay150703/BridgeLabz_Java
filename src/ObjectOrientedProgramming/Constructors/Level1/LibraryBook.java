package ObjectOrientedProgramming.Constructors.Level1;

/*
 * Program: Library Book System
 * Description: Manages book borrowing status.
 */
public class LibraryBook {

    // Book title
    String title;

    // Book author
    String author;

    // Book price
    double price;

    // Availability status
    boolean isAvailable;

    // Parameterized constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    // Method to borrow book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("OOPS in Java", "Herbert", 399);
        book.borrowBook();
        book.borrowBook();
    }
}
