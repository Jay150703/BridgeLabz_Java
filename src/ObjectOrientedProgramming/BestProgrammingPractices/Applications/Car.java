package ObjectOrientedProgramming.BestProgrammingPractices.Applications;

/*
 * Class: Car
 * Description: Car rental implementation.
 */
public class Car extends Vehicle implements Insurable {

    public Car(String number, double rate) {
        super(number, rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * rentalRate;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance applied";
    }
}
