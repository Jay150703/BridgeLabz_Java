package objectorientedprogramming.objectmodeling.assisted.Association;

/*
 * Class: Customer
 * Description: Represents a customer associated
 * with a bank account.
 */
public class Customer {

    // Customer name
    String customerName;

    // Account balance
    double balance;

    // Constructor
    public Customer(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    // View account balance
    void viewBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating bank
        Bank bank = new Bank("SBI");

        // Creating customer
        Customer customer = new Customer("Jayanthi", 10000);

        // Association and communication
        bank.openAccount(customer);
        customer.viewBalance();
    }
}
