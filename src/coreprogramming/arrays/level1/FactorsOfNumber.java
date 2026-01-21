package coreprogramming.arrays.level1;

import java.util.Scanner;

/**
 * FactorsOfNumber class demonstrates the concept of dynamic array resizing in Java.
 * 
 * Purpose:
 * This program finds and displays all factors of a given number. A factor is any
 * positive integer that divides the given number evenly (with no remainder).
 * 
 * Concepts Demonstrated:
 * - Arrays: Uses an integer array to store factors
 * - Dynamic Array Resizing: Automatically doubles the array size when it becomes full,
 *   allowing the program to handle numbers with an unknown number of factors
 * - Loop Control: Uses a for loop to iterate through potential factors
 * - Conditional Logic: Uses modulo operator to identify factors
 * - Array Manipulation: Copies array contents when resizing
 */
public class FactorsOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        // Check each number from 1 to the input number to find factors
        for (int i = 1; i <= number; i++) {

            // A factor divides the number evenly (remainder is 0)
            if (number % i == 0) {

                // If array is full, double its size and copy existing factors
                if (index == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];

                    // Copy all factors from old array to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors: ");
        // Print only the stored factors (up to index), not the entire array
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}