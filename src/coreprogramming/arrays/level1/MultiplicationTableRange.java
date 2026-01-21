package coreprogramming.arrays.level1;

import java.util.Scanner;

/**
 * MultiplicationTableRange class demonstrates partial array usage and index management.
 * 
 * Purpose:
 * This program generates a multiplication table for a given number, but only for
 * a specific range (multipliers 6 through 9), and stores the results in an array.
 * 
 * Concepts Demonstrated:
 * - Partial Array Usage: Uses only a portion of allocated array space
 * - Index Management: Manages index counter separately from loop variables
 * - Selective Storage: Stores values only for numbers in a specific range
 * - Post-increment Operator: Uses index++ to increment and use index value
 * - Array Efficiency: Demonstrates storing only required data points
 */
public class MultiplicationTableRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] result = new int[4];

        // Calculate and store multiplication table for range 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            result[index++] = number * i;
        }

        // Display the results from array
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index++]);
        }
    }
}