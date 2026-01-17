package ObjectOrientedProgramming.ObjectModeling.Assisted.Association;

/*
 * Class: Bank
 * Description: Represents a bank that associates
 * with multiple customers.
 */
public class Bank {

    // Bank name
    String bankName;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Open account for customer
    void openAccount(Customer customer) {
        System.out.println(customer.customerName + " opened an account in " + bankName);
    }
}
