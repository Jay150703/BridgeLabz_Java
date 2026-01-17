package ObjectOrientedProgramming.Fundamentals.Level2;

/*
 * Program: Shopping Cart
 * Description: Adds, removes items
 * and calculates total cost.
 */
public class CartItem {

    // Item name
    String itemName;

    // Item price
    double price;

    // Quantity of item
    int quantity;

    // Method to add item
    void addItem(String name, double cost, int qty) {
        itemName = name;
        price = cost;
        quantity = qty;
    }

    // Method to remove item
    void removeItem() {
        quantity = 0;
        System.out.println("Item removed from cart");
    }

    // Method to display total cost
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        // Creating CartItem object
        CartItem cart = new CartItem();

        // Adding item
        cart.addItem("Headphones", 1500, 2);

        // Displaying cost
        cart.displayTotalCost();

        // Removing item
        cart.removeItem();
    }
}
