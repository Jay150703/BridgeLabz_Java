package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

/**
 * FactorsWhile class demonstrates finding all factors of a number using a while loop.
 * 
 * Purpose:
 * This program reads a number and finds all its factors (divisors excluding the number itself)
 * by checking which numbers divide it evenly.
 * 
 * Concepts Demonstrated:
 * - While Loop: Manually controls iteration through potential divisors
 * - Modulo Operator: Uses % to check if a number is a factor (number % i == 0)
 * - Factor Finding: Identifies all numbers that divide evenly into the given number
 */
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            // Initialize counter for factor checking
            int i = 1;
            // Check each number from 1 to (number-1) for divisibility
            while (i < number) {
                // If number is evenly divisible by i, then i is a factor
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
