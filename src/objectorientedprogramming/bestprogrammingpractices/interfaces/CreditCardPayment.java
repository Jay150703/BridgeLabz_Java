package objectorientedprogramming.bestprogrammingpractices.interfaces;

/*
 * Class: CreditCardPayment
 * Description: Implements Payment interface.
 */
public class CreditCardPayment implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
