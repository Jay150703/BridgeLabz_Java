package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

/**
 * PrimeNumber class demonstrates prime number identification using loop and break.
 * 
 * Purpose:
 * This program reads a number and determines if it is a prime number
 * (only divisible by 1 and itself).
 * 
 * Concepts Demonstrated:
 * - Boolean Variables: Uses boolean flag to track prime status
 * - For Loop with Break: Exits early when a factor is found
 * - Modulo Operator: Checks for divisibility
 * - Prime Identification: Tests divisibility from 2 to number-1
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Initialize assuming number is prime
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 to number-1
            for (int i = 2; i < number; i++) {
                // If any factor is found, number is not prime
                if (number % i == 0) {
                    isPrime = false;
                    // Exit loop early once a factor is found
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
