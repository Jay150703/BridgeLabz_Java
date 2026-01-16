package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

/**
 * MultiplicationTable class demonstrates basic array storage and sequential processing.
 * 
 * Purpose:
 * This program generates and displays a multiplication table for a given number.
 * It stores products in an array and then displays them in a formatted manner.
 * 
 * Concepts Demonstrated:
 * - Integer Arrays: Stores multiplication results
 * - Array Population: Fills array with computed values in a loop
 * - Array Retrieval: Accesses stored values for display
 * - Loop-based Calculation: Uses loop counter for mathematical computation
 * - Array Indexing: Uses i-1 offset to map multiplier to array index
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[10];

        // Calculate multiplication table (1 to 10) and store in array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table from array
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}