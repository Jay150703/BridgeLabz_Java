package coreprogramming.controlflow.level1;

import java.util.Scanner;

/**
 * FactorialWhile class demonstrates while loop-based factorial calculation.
 * 
 * Purpose:
 * This program calculates the factorial of a non-negative integer N
 * using a while loop (N! = N × (N-1) × (N-2) × ... × 1).
 * 
 * Concepts Demonstrated:
 * - While Loop: Iterates based on a condition rather than a range
 * - Manual Loop Control: Requires explicit variable initialization and increment
 * - Accumulator Pattern: Multiplies values iteratively to build result
 * - Input Validation: Checks for non-negative values before processing
 */
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            // Initialize accumulator to 1 (multiplicative identity)
            int fact = 1;
            // Initialize loop counter
            int i = 1;

            // Continue while counter is less than or equal to N
            while (i <= n) {
                // Multiply current accumulator by loop variable
                fact *= i;
                // Manually increment counter
                i++;
            }

            System.out.println("Factorial is " + fact);
        } else {
            System.out.println("Invalid input");
        }
    }
}
