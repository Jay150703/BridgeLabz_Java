package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

/**
 * LargestSecondLargestDigit class demonstrates finding multiple extrema in a dataset.
 * 
 * Purpose:
 * This program extracts all digits from a number and finds the largest and second largest
 * digits. It uses a fixed-size array to store up to 10 digits.
 * 
 * Concepts Demonstrated:
 * - Digit Extraction: Extracts digits from a number using modulo and division
 * - Array Storage: Stores extracted digits in an array
 * - Index Management: Tracks the number of digits extracted
 * - Multiple Tracking Variables: Maintains largest and second largest digit values
 * - Conditional Updates: Updates largest/second largest based on comparisons
 */
public class LargestSecondLargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract all digits from the number and store in array
        while (number != 0 && index < maxDigit) {
            // Extract last digit and store it
            digits[index++] = number % 10;
            // Remove the last digit
            number /= 10;
        }

        int largest = 0, secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            // If current digit is larger than largest, shift largest to secondLargest
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            // If current digit is between second largest and largest
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}