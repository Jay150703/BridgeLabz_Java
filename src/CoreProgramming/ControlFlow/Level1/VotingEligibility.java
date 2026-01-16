package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

/**
 * VotingEligibility class demonstrates simple threshold-based conditional logic.
 * 
 * Purpose:
 * This program reads a person's age and determines whether they are eligible to vote
 * based on the legal voting age requirement.
 * 
 * Concepts Demonstrated:
 * - Conditional Statement: Uses if-else to make a binary decision
 * - Comparison Operator: Uses >= to check if age meets minimum requirement
 * - Input Validation: Evaluates user input against a threshold
 */
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Check if age meets minimum voting requirement
        if (age >= 18) {
            System.out.println("The person can vote");
        } else {
            System.out.println("The person cannot vote");
        }
    }
}
