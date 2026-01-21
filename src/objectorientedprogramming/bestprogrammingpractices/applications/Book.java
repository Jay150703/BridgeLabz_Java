package objectorientedprogramming.bestprogrammingpractices.applications;

/*
 * Class: Book
 * Description: Book implementation.
 */
public class Book extends LibraryItem implements Reservable {

    private boolean available = true;

    public Book(int id, String title) {
        super(id, title);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        available = false;
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
