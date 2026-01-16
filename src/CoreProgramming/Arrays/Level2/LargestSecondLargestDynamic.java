package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

/**
 * LargestSecondLargestDynamic class demonstrates dynamic array resizing with digit processing.
 * 
 * Purpose:
 * This program finds the largest and second largest digits in a number using dynamic array
 * resizing. The array grows by 10 elements each time it becomes full, accommodating numbers
 * with any number of digits.
 * 
 * Concepts Demonstrated:
 * - Dynamic Array Resizing: Expands array when capacity is reached
 * - Digit Extraction: Extracts all digits from a number
 * - Index Management: Tracks used array space
 * - Array Copying: Copies existing digits to new larger array
 * - Multiple Extrema Tracking: Finds both largest and second largest values
 */
public class LargestSecondLargestDynamic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits with dynamic array resizing
        while (number != 0) {

            // If array is full, resize it by adding 10 more slots
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                // Copy existing digits to new array
                for (int i = 0; i < digits.length; i++)
                    temp[i] = digits[i];
                digits = temp;
            }

            // Extract digit and store it
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            // If current digit exceeds largest, shift largest to secondLargest
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