package coreprogramming.controlflow.level2;

import java.util.Scanner;

/**
 * MultiplesBelow100For class demonstrates finding multiples of a number using a for loop.
 * 
 * Purpose:
 * This program reads a number and finds all its multiples below 100,
 * displaying them in descending order.
 * 
 * Concepts Demonstrated:
 * - Backward For Loop: Iterates from 100 down to 1 with decrement
 * - Modulo Operator: Uses % to identify multiples (i % number == 0)
 * - Range-based Finding: Identifies all multiples within a specific range
 */
public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            // Iterate backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of the given number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
