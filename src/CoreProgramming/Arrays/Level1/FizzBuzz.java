package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

/**
 * FizzBuzz class demonstrates string arrays and conditional logic with modulo operations.
 * 
 * Purpose:
 * This program implements the classic FizzBuzz challenge. For numbers 1 to N:
 * - Multiples of both 3 and 5 display "FizzBuzz"
 * - Multiples of 3 display "Fizz"
 * - Multiples of 5 display "Buzz"
 * - All other numbers display the number itself
 * 
 * Concepts Demonstrated:
 * - String Arrays: Stores string values instead of primitives
 * - Conditional Logic: Uses nested if-else to check multiple conditions
 * - Modulo Operator: Determines divisibility by checking remainder
 * - Type Conversion: Converts integers to strings using String.valueOf()
 * - Array Indexing: Uses i-1 offset to store values starting from index 0
 */
public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        String[] result = new String[number];

        // Generate FizzBuzz values for each number from 1 to N
        for (int i = 1; i <= number; i++) {

            // Check divisibility by both 3 and 5 first (most specific condition)
            if (i % 3 == 0 && i % 5 == 0)
                result[i - 1] = "FizzBuzz";
            // Check divisibility by 3
            else if (i % 3 == 0)
                result[i - 1] = "Fizz";
            // Check divisibility by 5
            else if (i % 5 == 0)
                result[i - 1] = "Buzz";
            // Store the number as a string if not divisible by 3 or 5
            else
                result[i - 1] = String.valueOf(i);
        }

        // Display each result with its position
        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }
    }
}