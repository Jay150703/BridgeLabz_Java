package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

/**
 * MultiplicationTable class demonstrates loop iteration with range specification.
 * 
 * Purpose:
 * This program reads a number and prints its multiplication table for a specific range (6 to 9).
 * 
 * Concepts Demonstrated:
 * - For Loop: Iterates through a specific range with custom start and end values
 * - Loop Variable: Uses loop counter to specify multiplication factors
 * - Arithmetic Operation: Multiplies the input number by each loop value
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
