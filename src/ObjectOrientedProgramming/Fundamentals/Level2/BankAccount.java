package ObjectOrientedProgramming.Fundamentals.Level2;

/*
 * Program: ATM Simulation
 * Description: Performs deposit, withdrawal,
 * and displays account balance.
 */
public class BankAccount {

    // Account holder name
    String accountHolder;

    // Account number
    long accountNumber;

    // Account balance
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating BankAccount object
        BankAccount account = new BankAccount();

        // Assigning values
        account.accountHolder = "Jayanthi";
        account.accountNumber = 1234567890;
        account.balance = 5000;

        // ATM operations
        account.deposit(2000);
        account.withdraw(1500);
        account.displayBalance();
    }
}
