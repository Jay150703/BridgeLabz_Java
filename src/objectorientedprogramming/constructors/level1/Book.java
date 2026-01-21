package objectorientedprogramming.constructors.level1;

/*
 * Program: Book Constructors
 * Description: Demonstrates default and parameterized constructors.
 */
public class Book {

    // Book title
    String title;

    // Book author
    String author;

    // Book price
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        book1.displayDetails();

        // Using parameterized constructor
        Book book2 = new Book("Java", "James Gosling", 499);
        book2.displayDetails();
    }
}
