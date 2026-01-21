package coreprogramming.controlflow.level2;

import java.util.Scanner;

/**
 * FizzBuzzFor class demonstrates nested conditional logic using a for loop.
 * 
 * Purpose:
 * This program implements the classic FizzBuzz challenge. For numbers 1 to N:
 * - Multiples of both 3 and 5 display "FizzBuzz"
 * - Multiples of 3 display "Fizz"
 * - Multiples of 5 display "Buzz"
 * - All other numbers display the number itself
 * 
 * Concepts Demonstrated:
 * - Nested Conditionals: Uses if-else if-else for multiple mutually exclusive conditions
 * - Modulo Operator: Checks divisibility using % for 3 and 5
 * - Logical AND Operator: Combines conditions to check divisibility by both 3 and 5
 * - For Loop: Iterates through range 1 to N
 */
public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            // Iterate through numbers 1 to N
            for (int i = 1; i <= number; i++) {
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
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
