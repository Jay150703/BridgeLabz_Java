package coreprogramming.controlflow.level3;

import java.util.Scanner;

/**
 * ArmstrongNumber class demonstrates number analysis using digit extraction.
 * 
 * Purpose:
 * This program reads a number and determines if it is an Armstrong number.
 * An Armstrong number equals the sum of its digits each cubed (e.g., 153 = 1³+5³+3³).
 * 
 * Concepts Demonstrated:
 * - While Loop: Processes digits until number becomes 0
 * - Modulo Operator: Extracts rightmost digit (number % 10)
 * - Integer Division: Removes processed digit (number / 10)
 * - Digit Extraction: Iteratively extracts and processes each digit
 * - Mathematical Comparison: Compares sum against original value
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Keep original number for comparison
        int originalNumber = number;
        // Initialize sum for accumulating cubed digits
        int sum = 0;

        // Extract each digit and cube it
        while (originalNumber != 0) {
            // Extract rightmost digit using modulo
            int digit = originalNumber % 10;
            // Add cube of digit to sum
            sum = sum + (digit * digit * digit);
            // Remove processed digit using integer division
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
