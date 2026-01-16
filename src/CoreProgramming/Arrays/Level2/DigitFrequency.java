package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

/**
 * DigitFrequency class demonstrates counting occurrences using array indexing.
 * 
 * Purpose:
 * This program counts how many times each digit (0-9) appears in a given number
 * and displays the frequency of each digit that appears at least once.
 * 
 * Concepts Demonstrated:
 * - Array as Counter: Uses array indices 0-9 to count digit occurrences
 * - Index-based Counting: Increments the array position corresponding to each digit
 * - Digit Extraction: Uses modulo and division to extract digits from a number
 * - Conditional Display: Only prints digits with frequency > 0
 * - Loop-based Processing: Iterates through all possible digit values
 */
public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to count frequency of each digit (0-9)
        int[] freq = new int[10];

        // Extract each digit and increment its frequency counter
        while (number != 0) {
            // Get the last digit using modulo 10
            int digit = number % 10;
            // Increment the counter for this digit
            freq[digit]++;
            // Remove the last digit by dividing by 10
            number /= 10;
        }

        // Display frequency of digits that appeared at least once
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println(i + " -> " + freq[i]);
        }
    }
}