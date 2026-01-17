package ObjectOrientedProgramming.Inheritance.HierarchicalInheritance.Level1;

/*
 * Class: CheckingAccount
 * Description: Checking account type.
 */
public class CheckingAccount extends BankAccount {

    private int withdrawalLimit;

    public CheckingAccount(String accNo, double bal, int limit) {
        super(accNo, bal);
        this.withdrawalLimit = limit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account | Limit: " + withdrawalLimit);
    }
}
