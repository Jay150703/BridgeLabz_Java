package ObjectOrientedProgramming.Inheritance.HierarchicalInheritance.Level1;

/*
 * Class: BankAccount
 * Description: Superclass for all bank account types.
 */
public class BankAccount {

    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}
