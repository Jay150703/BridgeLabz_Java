package coreprogramming.arrays.level1;

import java.util.Scanner;

/**
 * OddEvenArrays class demonstrates array partitioning and separate storage of filtered data.
 * 
 * Purpose:
 * This program separates numbers from 1 to N into two distinct arrays: one for odd numbers
 * and one for even numbers, then displays both arrays.
 * 
 * Concepts Demonstrated:
 * - Multiple Arrays: Uses two separate arrays for different data categories
 * - Array Sizing: Pre-calculates array sizes based on expected odd/even distribution
 * - Index Management: Maintains separate index counters for each array
 * - Data Partitioning: Distributes numbers into appropriate arrays based on condition
 * - Input Validation: Checks for invalid input (non-positive numbers)
 */
public class OddEvenArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Validate that input is a positive natural number
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // Create arrays sized to hold maximum possible odd/even numbers
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int eIndex = 0, oIndex = 0;

        // Distribute numbers 1 to N into odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[eIndex++] = i;
            else
                odd[oIndex++] = i;
        }

        // Display odd numbers stored (only up to oIndex)
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oIndex; i++)
            System.out.print(odd[i] + " ");

        // Display even numbers stored (only up to eIndex)
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < eIndex; i++)
            System.out.print(even[i] + " ");
    }
}