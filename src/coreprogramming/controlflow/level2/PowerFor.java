package coreprogramming.controlflow.level2;

import java.util.Scanner;

/**
 * PowerFor class demonstrates exponentiation using iterative multiplication.
 * 
 * Purpose:
 * This program calculates the power of a number (base ^ exponent)
 * by multiplying the base by itself exponent times using a for loop.
 * 
 * Concepts Demonstrated:
 * - For Loop: Iterates a specific number of times (exponent)
 * - Accumulator Pattern: Multiplies result iteratively
 * - Input Validation: Checks for positive base and non-negative exponent
 * - Exponential Calculation: Implements x^n by repeated multiplication
 */
public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();

        if (number > 0 && power >= 0) {
            // Initialize result to 1 (multiplicative identity)
            int result = 1;
            // Multiply number by itself power times
            for (int i = 1; i <= power; i++) {
                // Accumulate result by multiplying with base
                result = result * number;
            }
            System.out.println("Result is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
