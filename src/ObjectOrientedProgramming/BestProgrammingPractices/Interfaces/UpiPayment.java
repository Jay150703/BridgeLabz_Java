package ObjectOrientedProgramming.BestProgrammingPractices.Interfaces;

/*
 * Class: UpiPayment
 * Description: Implements Payment interface.
 */
public class UpiPayment implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
