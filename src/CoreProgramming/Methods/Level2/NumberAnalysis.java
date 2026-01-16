package CoreProgramming.Methods.Level2;

import java.util.Scanner;

/**
 * NumberAnalysis class demonstrates multiple boolean methods for number classification.
 * 
 * Purpose:
 * This program analyzes numbers by checking if they are positive/negative and even/odd,
 * and compares first and last numbers using dedicated boolean and comparison methods.
 * 
 * Concepts Demonstrated:
 * - Boolean Methods: Multiple methods returning true/false for different checks
 * - Ternary Operator: Uses conditional operator for compact display logic
 * - Comparison Method: Dedicated method for comparing two values
 * - Method Composition: Combines multiple method results
 * - Return Value Codes: Returns 1, 0, -1 for three-way comparison
 */
public class NumberAnalysis {

    // Method to check if number is positive
    public static boolean isPositive(int n) {
        return n > 0;
    }

    // Method to check if number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Method to compare two numbers: returns 1 if a>b, 0 if equal, -1 if b>a
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Collect and analyze 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();

            // Check positivity and parity using helper methods
            if (isPositive(numbers[i])) {
                // Use ternary operator to display appropriate message
                System.out.println(isEven(numbers[i]) ? "Positive Even" : "Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        // Compare first and last numbers
        int result = compare(numbers[0], numbers[4]);

        // Interpret comparison result and display
        if (result == 1) System.out.println("First is Greater");
        else if (result == 0) System.out.println("Both are Equal");
        else System.out.println("Last is Greater");
    }
}