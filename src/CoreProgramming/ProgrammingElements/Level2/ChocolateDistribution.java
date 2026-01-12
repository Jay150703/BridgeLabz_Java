package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {

        int numberOfChocolates, numberOfChildren;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        numberOfChildren = input.nextInt();

        int eachChildGets = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " +
                eachChildGets +
                " and the number of remaining chocolates are " +
                remaining);
    }

}
