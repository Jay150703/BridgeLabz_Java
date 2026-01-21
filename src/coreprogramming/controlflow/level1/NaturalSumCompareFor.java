package coreprogramming.controlflow.level1;

import java.util.Scanner;

/**
 * NaturalSumCompareFor class demonstrates comparing two methods for sum calculation.
 * 
 * Purpose:
 * This program calculates the sum of first N natural numbers using both
 * a mathematical formula and a for loop, then compares the results.
 * 
 * Concepts Demonstrated:
 * - Mathematical Formula: Applies formula for efficiency (N × (N+1) / 2)
 * - For Loop Accumulation: Uses iterative approach with loop and accumulator
 * - Result Comparison: Displays both methods to show they produce identical results
 * - Algorithm Efficiency: Demonstrates two approaches with different time complexities
 */
public class NaturalSumCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            // Calculate sum using mathematical formula: n * (n+1) / 2
            int formulaSum = n * (n + 1) / 2;
            // Calculate sum using iterative loop approach
            int loopSum = 0;

            // Accumulate sum by iterating from 1 to N
            for (int i = 1; i <= n; i++) {
                // Add current number to running sum
                loopSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
