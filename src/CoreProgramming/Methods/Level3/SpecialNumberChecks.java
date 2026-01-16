package CoreProgramming.Methods.Level3;

/**
 * SpecialNumberChecks class demonstrates various special number classifications.
 * 
 * Purpose:
 * This class provides methods to check if numbers are prime, neon, spy, automorphic,
 * or buzz numbers - each with unique mathematical properties.
 * 
 * Concepts Demonstrated:
 * - Prime Numbers: Numbers with no divisors except 1 and itself
 * - Neon Numbers: Sum of digits of square equals the number
 * - Spy Numbers: Sum of digits equals product of digits
 * - Automorphic Numbers: Number appears at end of its square
 * - Buzz Numbers: Divisible by 7 or ends with 7
 */
public class SpecialNumberChecks {

    // Method to check if number is prime
    public static boolean isPrime(int n) {
        // Numbers <= 1 are not prime
        if (n <= 1) return false;
        // Check divisibility up to square root
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // Method to check if number is neon (sum of square digits equals number)
    public static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        // Sum digits of the square
        while (sq != 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }

    // Method to check if number is spy (digit sum equals digit product)
    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        // Extract digits and calculate sum and product
        while (n != 0) {
            int d = n % 10;
            sum += d; prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    // Method to check if number is automorphic (appears at end of its square)
    public static boolean isAutomorphic(int n) {
        // Check if number string is at end of square string
        return String.valueOf(n * n).endsWith(String.valueOf(n));
    }

    // Method to check if number is buzz (divisible by 7 or ends with 7)
    public static boolean isBuzz(int n) {
        // Buzz if divisible by 7 OR last digit is 7
        return n % 7 == 0 || n % 10 == 7;
    }
}