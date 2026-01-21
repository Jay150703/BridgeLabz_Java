package coreprogramming.controlflow.level2;

import java.util.Scanner;

/**
 * OddEvenNumbers class demonstrates classifying numbers in a range.
 * 
 * Purpose:
 * This program reads a number N and displays all numbers from 1 to N,
 * classifying each as odd or even.
 * 
 * Concepts Demonstrated:
 * - For Loop: Iterates from 1 to N
 * - Conditional Classification: Uses if-else to categorize numbers
 * - Modulo Operator: Uses % 2 to determine odd/even
 * - Range-based Processing: Processes all numbers in a sequence
 */
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            // Iterate from 1 to N
            for (int i = 1; i <= number; i++) {
                // Check if number is even using modulo operator
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
