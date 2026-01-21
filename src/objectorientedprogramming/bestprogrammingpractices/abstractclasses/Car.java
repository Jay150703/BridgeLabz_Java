package objectorientedprogramming.bestprogrammingpractices.abstractclasses;

/*
 * Class: Car
 * Description: Concrete implementation of Vehicle.
 */
public class Car extends Vehicle {

    public Car(String model, double rate) {
        super(model, rate);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}
