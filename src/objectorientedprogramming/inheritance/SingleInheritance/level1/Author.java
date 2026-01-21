package objectorientedprogramming.inheritance.SingleInheritance.level1;

/*
 * Class: Author
 * Description: Subclass extending Book with author details.
 */
public class Author extends Book {

    private String name;
    private String bio;

    public Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }

    public static void main(String[] args) {
        Author author = new Author(
                "Java OOPS",
                2025,
                "James Gosling",
                "Father of Java"
        );
        author.displayInfo();
    }
}
