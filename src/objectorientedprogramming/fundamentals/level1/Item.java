package objectorientedprogramming.fundamentals.level1;

/*
 * Program: Item Inventory
 * Description: Displays item details and calculates total cost.
 */
public class Item {

    // Item code
    int itemCode;

    // Item name
    String itemName;

    // Item price
    double price;

    // Method to display item details
    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        // Creating Item object
        Item item = new Item();

        // Assigning values
        item.itemCode = 201;
        item.itemName = "Keyboard";
        item.price = 750;

        // Displaying details
        item.displayItemDetails();

        // Calculating total cost
        System.out.println("Total Cost: " + item.calculateTotalCost(3));
    }
}
