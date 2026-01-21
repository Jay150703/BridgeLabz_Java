package objectorientedprogramming.bestprogrammingpractices.abstractclasses;

/*
 * Class: Vehicle
 * Description: Abstract class with shared behavior.
 */
public abstract class Vehicle {

    protected String model;
    protected double ratePerDay;

    public Vehicle(String model, double ratePerDay) {
        this.model = model;
        this.ratePerDay = ratePerDay;
    }

    // Abstract method
    public abstract double calculateRent(int days);

    // Concrete method
    public void displayDetails() {
        System.out.println("Model: " + model);
    }
}
