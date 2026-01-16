package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

/**
 * StoreNumbersAndSum class demonstrates array-based accumulation with user-controlled input.
 * 
 * Purpose:
 * This program collects positive numbers from the user (up to 10 numbers) and stores them
 * in an array, then calculates and displays their sum. Input ends when user enters a
 * non-positive number or after 10 numbers are entered.
 * 
 * Concepts Demonstrated:
 * - Double Arrays: Stores floating-point values for flexible number handling
 * - While Loop: Uses loop to collect variable number of inputs
 * - Array Bounds: Enforces maximum capacity of 10 elements
 * - Accumulation: Sums array elements after collection
 * - Input Validation: Stops collection on non-positive input
 */
public class StoreNumbersAndSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Collect positive numbers until user enters non-positive value or array is full
        while (true) {

            System.out.print("Enter a number: ");
            double value = sc.nextDouble();

            // Stop if non-positive number or array is full
            if (value <= 0 || index == 10) {
                break;
            }

            numbers[index++] = value;
        }

        // Calculate sum of all stored numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Total Sum = " + total);
    }
}