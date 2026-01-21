package coreprogramming.controlflow.level1;

import java.util.Scanner;

/**
 * OddEven class demonstrates loop iteration and conditional classification.
 * 
 * Purpose:
 * This program reads a number N and displays all numbers from 1 to N,
 * classifying each as either odd or even.
 * 
 * Concepts Demonstrated:
 * - For Loop: Iterates from 1 to N with automatic increment
 * - Conditional Statements: Uses if-else for binary classification
 * - Modulo Operator: Uses % 2 to determine if number is even or odd
 * - Loop Control: Processes all numbers in a sequential range
 */
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Iterate from 1 to N and check each number
        for (int i = 1; i <= n; i++) {
            // Check if number is even using modulo operator
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
