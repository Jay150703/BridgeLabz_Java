package coreprogramming.controlflow.level2;

import java.util.Scanner;

/**
 * MultiplesBelow100While class demonstrates finding multiples using a while loop.
 * 
 * Purpose:
 * This program reads a number and finds all its multiples below 100,
 * displaying them in descending order using a while loop.
 * 
 * Concepts Demonstrated:
 * - Backward While Loop: Uses decrement to iterate from 100 down to 1
 * - Manual Counter Control: Requires explicit initialization and modification
 * - Modulo Operator: Uses % to identify multiples (i % number == 0)
 */
public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            // Initialize counter at 100
            int i = 100;
            // Iterate backward from 100 to 1
            while (i >= 1) {
                // Check if i is a multiple of the given number
                if (i % number == 0) {
                    System.out.println(i);
                }
                i--;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
