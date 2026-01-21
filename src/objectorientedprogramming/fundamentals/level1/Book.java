package objectorientedprogramming.fundamentals.level1;

/*
 * Program: Book Details
 * Description: Stores and displays book information.
 */
public class Book {

    // Book title
    String title;

    // Book author
    String author;

    // Book price
    double price;

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Creating Book object
        Book book = new Book();

        // Assigning values
        book.title = "Java Programming";
        book.author = "James Gosling";
        book.price = 499.99;

        // Displaying details
        book.displayBookDetails();
    }
}
