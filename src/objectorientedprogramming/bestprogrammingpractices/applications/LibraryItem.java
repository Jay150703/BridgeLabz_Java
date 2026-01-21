package objectorientedprogramming.bestprogrammingpractices.applications;

/*
 * Class: LibraryItem
 * Description: Abstract library item.
 */
public abstract class LibraryItem {

    private int itemId;
    protected String title;

    public LibraryItem(int id, String title) {
        this.itemId = id;
        this.title = title;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Title: " + title);
    }
}
