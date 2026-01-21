package coreprogramming.controlflow.level1;

import java.util.Scanner;

/**
 * SumUntilZero class demonstrates loop control with break statement.
 * 
 * Purpose:
 * This program continuously reads numbers and accumulates their sum,
 * stopping when zero is entered.
 * 
 * Concepts Demonstrated:
 * - Infinite While Loop: Uses while(true) with explicit break condition
 * - Break Statement: Exits the loop when termination condition is met
 * - Accumulator Pattern: Adds each input to a running total
 * - Conditional Loop Exit: Uses if statement to control loop termination
 */
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        // Continue looping until zero is entered
        while (true) {
            double num = sc.nextDouble();
            // Check if number is exactly zero
            if (num == 0) {
                // Exit the loop when termination condition is met
                break;
            }
            // Add non-zero number to running total
            total += num;
        }

        System.out.println("Total sum is " + total);
    }
}
