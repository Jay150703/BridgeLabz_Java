package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

/**
 * NaturalSumCompareWhile class demonstrates comparing two methods for sum calculation.
 * 
 * Purpose:
 * This program calculates the sum of first N natural numbers using both
 * a mathematical formula and a while loop, then compares the results.
 * 
 * Concepts Demonstrated:
 * - Mathematical Formula: Applies formula for efficiency (N × (N+1) / 2)
 * - While Loop Accumulation: Uses manual control with while loop and accumulator
 * - Result Comparison: Displays both methods to show they produce identical results
 * - Algorithm Comparison: Demonstrates formula-based vs iteration-based approaches
 */
public class NaturalSumCompareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            // Calculate sum using mathematical formula: n * (n+1) / 2
            int formulaSum = n * (n + 1) / 2;
            // Calculate sum using iterative loop approach
            int loopSum = 0;
            // Initialize loop counter
            int i = 1;

            // Accumulate sum by iterating from 1 to N
            while (i <= n) {
                // Add current number to running sum
                loopSum += i;
                // Manually increment counter
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
