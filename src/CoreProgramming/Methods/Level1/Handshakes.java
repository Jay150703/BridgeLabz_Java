package CoreProgramming.Methods.Level1;

import java.util.Scanner;

/**
 * Handshakes class demonstrates mathematical formula application in method-less program.
 * 
 * Purpose:
 * This program calculates the maximum number of unique handshakes possible among a group
 * of students using the mathematical formula n(n-1)/2.
 * 
 * Concepts Demonstrated:
 * - Mathematical Formula: Applies combinatorial formula for handshakes
 * - Integer Arithmetic: Performs division and multiplication
 * - User Input: Accepts number of students from user
 * - Direct Calculation: Performs calculation inline without helper method
 */
public class Handshakes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate handshakes using formula: n(n-1)/2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Number of possible handshakes: " + handshakes);
    }
}