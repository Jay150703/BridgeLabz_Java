package coreprogramming.controlflow.level2;

import java.util.Scanner;

/**
 * FizzBuzzWhile class demonstrates nested conditional logic using a while loop.
 * 
 * Purpose:
 * This program implements the classic FizzBuzz challenge. For numbers 1 to N:
 * - Multiples of both 3 and 5 display "FizzBuzz"
 * - Multiples of 3 display "Fizz"
 * - Multiples of 5 display "Buzz"
 * - All other numbers display the number itself
 * 
 * Concepts Demonstrated:
 * - While Loop: Manually controls iteration with counter variable
 * - Nested Conditionals: Uses if-else if-else for multiple conditions
 * - Modulo Operator: Checks divisibility using %
 * - Logical AND Operator: Combines multiple conditions
 */
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            // Initialize counter and manually control iteration
            int i = 1;
            // Iterate through numbers 1 to N
            while (i <= number) {
                // Check divisibility by both 3 and 5 first (most specific case)
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
