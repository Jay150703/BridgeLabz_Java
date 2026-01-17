package ObjectOrientedProgramming.Inheritance.HierarchicalInheritance.Level1;

/*
 * Class: FixedDepositAccount
 * Description: Fixed deposit account type.
 */
public class FixedDepositAccount extends BankAccount {

    public FixedDepositAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }

    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("S001", 5000, 4.5),
                new CheckingAccount("C001", 8000, 5),
                new FixedDepositAccount("FD001", 20000)
        };

        for (BankAccount acc : accounts) {
            acc.displayAccountType();
        }
    }
}
