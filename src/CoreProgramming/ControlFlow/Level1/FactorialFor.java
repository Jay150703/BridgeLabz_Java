package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

/**
 * FactorialFor class demonstrates loop-based factorial calculation.
 * 
 * Purpose:
 * This program calculates the factorial of a non-negative integer N
 * using a for loop (N! = N × (N-1) × (N-2) × ... × 1).
 * 
 * Concepts Demonstrated:
 * - For Loop: Iterates from 1 to N with automatic increment
 * - Multiplication Operation: Accumulates product by multiplying iteratively
 * - Conditional Validation: Checks if input is non-negative before calculation
 * - Variable Initialization: Initializes accumulator (fact) to 1
 */
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            // Initialize accumulator to 1 (multiplicative identity)
            int fact = 1;

            // Multiply all numbers from 1 to N
            for (int i = 1; i <= n; i++) {
                // Multiply current accumulator by loop variable
                fact *= i;
            }

            System.out.println("Factorial is " + fact);
        } else {
            System.out.println("Invalid input");
        }
    }
}
