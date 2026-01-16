package CoreProgramming.Methods.Level3;

/**
 * PalindromeNumber class demonstrates array reversal and palindrome checking.
 * 
 * Purpose:
 * This class provides methods to reverse a digit array and check if a sequence
 * of digits is palindromic (reads the same forwards and backwards).
 * 
 * Concepts Demonstrated:
 * - Array Reversal: Creates new array with elements in reverse order
 * - Array Comparison: Compares two arrays element by element
 * - Palindrome Property: Number is palindrome if equals its reverse
 * - Index Mirroring: Accesses elements from opposite ends
 */
public class PalindromeNumber {

    // Method to reverse an array
    public static int[] reverse(int[] digits) {
        int[] rev = new int[digits.length];
        // Copy elements in reverse order
        for (int i = 0; i < digits.length; i++)
            rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    // Method to compare two arrays for equality
    public static boolean compare(int[] a, int[] b) {
        // Arrays must have same length
        if (a.length != b.length) return false;
        // Check each element matches
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    // Method to check if digit array is palindromic
    public static boolean isPalindrome(int[] digits) {
        // Palindrome if original equals its reverse
        return compare(digits, reverse(digits));
    }
}