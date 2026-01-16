package CoreProgramming.Methods.Level3;

/**
 * NumberCheckerAdvanced class demonstrates advanced number classifications and analysis.
 * 
 * Purpose:
 * This class provides methods for Harshad number checking and digit frequency analysis
 * of extracted digits from a number.
 * 
 * Concepts Demonstrated:
 * - Harshad Numbers: Numbers divisible by sum of their digits
 * - Digit Frequency: Counts occurrences of each digit
 * - Dynamic Array Sizing: Creates appropriately sized result array
 * - Frequency Array: Uses array index as digit value
 * - 2D Result Array: Returns frequency in 2D array format
 */
public class NumberCheckerAdvanced {

    // Method to sum all digits
    public static int sumDigits(int[] digits) {
        int s = 0;
        // Accumulate all digit values
        for (int d : digits) s += d;
        return s;
    }

    // Method to check if number is Harshad (divisible by sum of digits)
    public static boolean isHarshad(int n, int[] digits) {
        // Harshad number if divisible by sum of its digits
        return n % sumDigits(digits) == 0;
    }

    // Method to calculate frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        // Array to store frequency of digits 0-9
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;

        // Count how many unique digits exist
        int count = 0;
        for (int f : freq) if (f > 0) count++;

        // Create result array with only non-zero frequencies
        int[][] result = new int[count][2];
        int idx = 0;
        // Populate result with digit and its frequency
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }
}