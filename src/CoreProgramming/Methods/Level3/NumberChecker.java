package CoreProgramming.Methods.Level3;

/**
 * NumberChecker class demonstrates digit extraction and special number classification.
 * 
 * Purpose:
 * This class provides methods to extract digits from a number and classify numbers
 * as duck numbers, Armstrong numbers, and find largest/smallest digits.
 * 
 * Concepts Demonstrated:
 * - Digit Extraction: Converts number into digit array
 * - Duck Numbers: Numbers containing digit 0
 * - Armstrong Numbers: Sum of digit powers equals the number
 * - Extrema Tracking: Finds multiple largest and smallest digits
 * - Power Calculation: Uses Math.pow for digit power operations
 */
public class NumberChecker {

    // Method to count number of digits
    public static int countDigits(int n) {
        int c = 0;
        // Count by repeated division by 10
        while (n != 0) { c++; n /= 10; }
        return c;
    }

    // Method to extract digits into array
    public static int[] getDigits(int n) {
        // Create array with exact size needed
        int[] d = new int[countDigits(n)];
        int i = 0;
        // Extract each digit using modulo
        while (n != 0) {
            d[i++] = n % 10;
            n /= 10;
        }
        return d;
    }

    // Method to check if number is duck (contains 0 digit)
    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    // Method to check if number is Armstrong (sum of digit powers equals number)
    public static boolean isArmstrong(int n, int[] digits) {
        // Power equals number of digits
        int power = digits.length;
        int sum = 0;
        // Sum each digit raised to the power
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == n;
    }

    // Method to find largest and second largest digits
    public static int[] largestSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
        // Iterate and track two largest values
        for (int d : digits) {
            if (d > max) { sec = max; max = d; }
            else if (d > sec && d != max) sec = d;
        }
        return new int[]{max, sec};
    }

    // Method to find smallest and second smallest digits
    public static int[] smallestSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, sec = Integer.MAX_VALUE;
        // Iterate and track two smallest values
        for (int d : digits) {
            if (d < min) { sec = min; min = d; }
            else if (d < sec && d != min) sec = d;
        }
        return new int[]{min, sec};
    }

    public static void main(String[] args) {
        // Test with Armstrong number 153 (1³ + 5³ + 3³ = 153)
        int number = 153;
        int[] digits = getDigits(number);

        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(number, digits));
    }
}