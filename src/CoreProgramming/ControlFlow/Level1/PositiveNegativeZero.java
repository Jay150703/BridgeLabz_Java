package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

/**
 * PositiveNegativeZero class demonstrates multi-branch conditional logic.
 * 
 * Purpose:
 * This program reads a single number and classifies it as positive, negative, or zero.
 * 
 * Concepts Demonstrated:
 * - Multi-branch Conditionals: Uses if-else if-else to handle three mutually exclusive cases
 * - Comparison Operators: Uses > and < to compare values against zero
 * - Number Classification: Categorizes numbers based on their relationship to zero
 */
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Classify number based on its relationship to zero
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
