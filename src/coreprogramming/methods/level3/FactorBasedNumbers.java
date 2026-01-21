package coreprogramming.methods.level3;

/**
 * FactorBasedNumbers class demonstrates classification of numbers based on their factors.
 * 
 * Purpose:
 * This class provides methods to find factors and classify numbers as perfect, abundant,
 * deficient, or strong based on mathematical properties of their digits and factors.
 * 
 * Concepts Demonstrated:
 * - Factor Extraction: Two-pass algorithm to find all factors
 * - Number Classification: Classifies numbers by sum of proper factors
 * - Perfect Numbers: Sum of proper factors equals the number
 * - Abundant Numbers: Sum of proper factors exceeds the number
 * - Strong Numbers: Sum of factorials of digits equals the number
 */
public class FactorBasedNumbers {

    // Method to find all factors of a number
    public static int[] factors(int n) {
        // First pass: count the factors
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        // Create array with exact size
        int[] f = new int[count];
        int idx = 0;
        // Second pass: populate array with factors
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }

    // Method to check if number is perfect (sum of proper factors equals number)
    public static boolean isPerfect(int n) {
        int sum = 0;
        // Sum all proper factors (excluding n itself)
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    // Method to check if number is abundant (sum of proper factors exceeds number)
    public static boolean isAbundant(int n) {
        int sum = 0;
        // Sum all proper factors
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    // Method to check if number is deficient (sum of proper factors less than number)
    public static boolean isDeficient(int n) {
        int sum = 0;
        // Sum all proper factors
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    // Method to check if number is strong (sum of factorials of digits equals number)
    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        // Extract each digit and calculate factorial
        while (temp != 0) {
            int d = temp % 10;
            // Calculate factorial of digit
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == n;
    }
}