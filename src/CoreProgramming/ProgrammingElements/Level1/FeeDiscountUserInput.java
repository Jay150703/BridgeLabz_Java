package CoreProgramming.ProgrammingElements.Level1;
import java.util.Scanner;

public class FeeDiscountUserInput {
    public static void main(String[] args){
        double fee;
        double discountPercent;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter fee: ");
        fee = input.nextInt();

        System.out.print("Enter discount percentage: ");
        discountPercent = input.nextInt();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}
