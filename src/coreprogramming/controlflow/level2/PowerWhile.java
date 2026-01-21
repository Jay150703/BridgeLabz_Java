package coreprogramming.controlflow.level2;

import java.util.Scanner;

/**
 * PowerWhile class demonstrates exponentiation using a while loop.
 * 
 * Purpose:
 * This program calculates the power of a number (base ^ exponent)
 * by multiplying the base by itself exponent times using a while loop.
 * 
 * Concepts Demonstrated:
 * - While Loop: Manually controls iteration with counter variable
 * - Accumulator Pattern: Multiplies result iteratively
 * - Manual Counter Control: Requires explicit initialization and increment
 * - Exponential Calculation: Implements x^n by repeated multiplication
 */
public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();

        // Initialize result to 1 (multiplicative identity)
        int result = 1;
        // Initialize counter to control iteration
        int counter = 0;

        // Multiply number by itself power times
        while (counter < power) {
            // Accumulate result by multiplying with base
            result = result * number;
            // Increment counter to control iterations
            counter++;
        }

        System.out.println("Result is " + result);
    }
}
