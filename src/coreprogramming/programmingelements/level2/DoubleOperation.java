package coreprogramming.programmingelements.level2;
import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {

        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = input.nextDouble();

        System.out.print("Enter b: ");
        b = input.nextDouble();

        System.out.print("Enter c: ");
        c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Double Operations are " +
                result1 + ", " + result2 +
                ", " + result3 + ", and " + result4);
    }
}
