package coreprogramming.methods.level1;

import java.util.Scanner;

/**
 * HandshakesUsingMethod class demonstrates method-based formula application.
 * 
 * Purpose:
 * This program calculates the maximum number of unique handshakes among students
 * using a helper method that encapsulates the mathematical formula.
 * 
 * Concepts Demonstrated:
 * - Method Definition: Defines static method with integer parameter and return type
 * - Formula Encapsulation: Wraps mathematical logic in reusable method
 * - Method Invocation: Calls method with parameter from main
 * - Return Statement: Returns calculated result to caller
 * - Code Reusability: Makes formula reusable for multiple calls
 */
public class HandshakesUsingMethod {

    // Method to calculate number of handshakes using formula n(n-1)/2
    public static int calculateHandshakes(int n) {
        // Apply handshake formula
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Call method to calculate handshakes
        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum number of handshakes = " + handshakes);
    }
}