package objectorientedprogramming.inheritance.HierarchicalInheritance.level1;

/*
 * Class: SavingsAccount
 * Description: Savings account type.
 */
public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accNo, double bal, double interestRate) {
        super(accNo, bal);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account | Interest: " + interestRate + "%");
    }
}
