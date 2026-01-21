package coreprogramming.methods.level2;

import java.util.Scanner;

/**
 * SumNaturalNumbersCompare class demonstrates recursion versus formula-based calculation.
 * 
 * Purpose:
 * This program calculates the sum of natural numbers using two different approaches:
 * recursive method and direct formula, then compares the results.
 * 
 * Concepts Demonstrated:
 * - Recursion: Implements recursive sum with base case and recursive case
 * - Base Case: Defines stopping condition for recursive method
 * - Formula-based Approach: Uses mathematical formula n(n+1)/2
 * - Result Comparison: Verifies both methods produce identical results
 * - Method Validation: Uses testing to confirm implementation correctness
 */
public class SumNaturalNumbersCompare {

    // Method to calculate sum using recursion
    public static int sumRecursive(int n) {
        // Base case: stop recursion when n reaches 0
        if (n == 0)
            return 0;
        // Recursive case: add n to sum of remaining numbers
        return n + sumRecursive(n - 1);
    }

    // Method to calculate sum using mathematical formula n(n+1)/2
    public static int sumFormula(int n) {
        // Direct formula calculation
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Validate input is a natural number
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        // Calculate sum using both methods
        int r1 = sumRecursive(n);
        int r2 = sumFormula(n);

        // Display results from both approaches
        System.out.println("Sum using recursion = " + r1);
        System.out.println("Sum using formula = " + r2);
        // Verify both methods produce same result
        System.out.println("Both results are equal: " + (r1 == r2));
    }
}