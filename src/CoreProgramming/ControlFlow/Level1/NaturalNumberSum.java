package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

/**
 * NaturalNumberSum class demonstrates formula-based mathematical calculation.
 * 
 * Purpose:
 * This program calculates the sum of first N natural numbers using the mathematical formula
 * instead of iteration (Sum = N × (N+1) / 2).
 * 
 * Concepts Demonstrated:
 * - Mathematical Formula: Applies the formula for sum of natural numbers for efficiency
 * - Input Validation: Checks if input is a valid non-negative number
 * - Arithmetic Operations: Performs multiplication and division
 */
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            // Apply formula for sum of natural numbers: n * (n+1) / 2
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println(n + " is not a natural number");
        }
    }
}
