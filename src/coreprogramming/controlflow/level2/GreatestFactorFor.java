package coreprogramming.controlflow.level2;

import java.util.Scanner;

/**
 * GreatestFactorFor class demonstrates finding the greatest factor of a number.
 * 
 * Purpose:
 * This program reads a number and finds its greatest factor (excluding the number itself).
 * It searches backward from number-1 to find the largest divisor.
 * 
 * Concepts Demonstrated:
 * - Backward For Loop: Iterates from number-1 down to 1
 * - Break Statement: Exits loop immediately upon finding first (largest) factor
 * - Factor Finding: Uses modulo to identify divisors
 * - Algorithm Efficiency: Searches backward to find largest match quickly
 */
public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Initialize to 1 (every number has 1 as a factor)
        int greatestFactor = 1;

        // Search backward from number-1 to find greatest factor
        for (int i = number - 1; i >= 1; i--) {
            // Check if i divides number evenly
            if (number % i == 0) {
                // Store the first (greatest) factor found
                greatestFactor = i;
                // Exit loop immediately since we found the largest
                break;
            }
        }

        System.out.println("Greatest factor is " + greatestFactor);
    }
}
