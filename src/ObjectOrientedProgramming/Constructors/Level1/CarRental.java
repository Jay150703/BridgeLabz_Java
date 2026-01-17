package ObjectOrientedProgramming.Constructors.Level1;

/*
 * Program: Car Rental System
 * Description: Calculates total rental cost using constructors.
 */
public class CarRental {

    // Customer name
    String customerName;

    // Car model
    String carModel;

    // Rental days
    int rentalDays;

    // Cost per day
    double costPerDay = 1500;

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Jayanthi", "Hyundai i20", 4);
        System.out.println("Total Cost: " + rental.calculateTotalCost());
    }
}

