package coreprogramming.arrays.level2;

import java.util.Scanner;

/**
 * ReverseNumber class demonstrates digit extraction and array-based reversal.
 * 
 * Purpose:
 * This program reverses a number by extracting its digits, storing them in an array,
 * and displaying them in the order they were extracted (which is reverse order).
 * 
 * Concepts Demonstrated:
 * - Digit Extraction: Uses modulo and division to extract digits
 * - Dynamic Array Sizing: First counts digits, then creates appropriately sized array
 * - Two-pass Processing: First pass counts digits, second pass stores them
 * - Array Population: Stores digits in extraction order (reverse of original)
 * - Index Management: Tracks position while filling array
 */
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // First pass: count the number of digits
        int temp = number, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Create array with exact size needed for all digits
        int[] digits = new int[count];
        int index = 0;

        // Second pass: extract digits and store in array (reversed order naturally)
        while (number != 0) {
            // Extract last digit and store in array
            digits[index++] = number % 10;
            // Remove the last digit
            number /= 10;
        }

        // Display the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}