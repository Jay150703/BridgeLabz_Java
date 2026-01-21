package objectorientedprogramming.fundamentals.level1;

/*
 * Program: Mobile Phone Details
 * Description: Stores and displays mobile phone information.
 */
public class MobilePhone {

    // Mobile brand
    String brand;

    // Mobile model
    String model;

    // Mobile price
    double price;

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Creating MobilePhone object
        MobilePhone phone = new MobilePhone();

        // Assigning values
        phone.brand = "Samsung";
        phone.model = "Galaxy S23";
        phone.price = 75000;

        // Displaying details
        phone.displayDetails();
    }
}
