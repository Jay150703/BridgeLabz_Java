package CoreProgramming.Methods.Level1;

import java.util.Scanner;

/**
 * CheckNumber class demonstrates method definition and return values for classification.
 * 
 * Purpose:
 * This program classifies a number as positive, negative, or zero using a helper method
 * that returns different integer values for each classification.
 * 
 * Concepts Demonstrated:
 * - Method Definition: Defines a static method with return type int
 * - Conditional Logic: Uses if-else statements to determine number type
 * - Return Values: Returns 1 for positive, -1 for negative, 0 for zero
 * - Method Invocation: Calls method from main and uses returned value
 * - Value-based Classification: Interprets return values to display appropriate message
 */
public class CheckNumber {

    // Method to check number and return classification code
    public static int checkNumber(int number) {
        // Return 1 if positive, -1 if negative, 0 if zero
        if (number > 0)
            return 1;
        else if (number < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call method and store classification code
        int result = checkNumber(number);

        // Use classification code to display appropriate message
        if (result == 1)
            System.out.println("Positive Number");
        else if (result == -1)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
}