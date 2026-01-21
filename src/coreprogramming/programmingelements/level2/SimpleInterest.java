package coreprogramming.programmingelements.level2;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        double principal, rate, time;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal: ");
        principal = input.nextDouble();

        System.out.print("Enter rate of interest: ");
        rate = input.nextDouble();

        System.out.print("Enter time: ");
        time = input.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}
