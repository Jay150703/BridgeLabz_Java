package coreprogramming.methods.level1;

import java.util.Scanner;

/**
 * SumOfNaturalNumbers class demonstrates iterative calculation using a method.
 * 
 * Purpose:
 * This program calculates the sum of natural numbers from 1 to N using a helper method
 * that iterates through all numbers and accumulates their sum.
 * 
 * Concepts Demonstrated:
 * - Method Definition: Defines method with single integer parameter
 * - Loop-based Calculation: Uses for loop to accumulate sum
 * - Accumulation Pattern: Uses sum variable to collect running total
 * - Integer Return: Returns calculated sum value
 * - Method Encapsulation: Separates calculation logic from main method
 */
public class SumOfNaturalNumbers {

    // Method to calculate sum of natural numbers from 1 to n
    public static int findSum(int n) {
        int sum = 0;
        // Iterate from 1 to n and accumulate sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Call method to calculate sum
        int sum = findSum(n);
        System.out.println("Sum of " + n + " natural numbers = " + sum);
    }
}