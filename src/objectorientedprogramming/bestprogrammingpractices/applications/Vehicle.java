package objectorientedprogramming.bestprogrammingpractices.applications;

/*
 * Class: Vehicle
 * Description: Abstract vehicle class.
 */
public abstract class Vehicle {

    private String vehicleNumber;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}
