package coreprogramming.arrays.level1;

import java.util.Scanner;

/**
 * VotingEligibility class demonstrates age validation and conditional eligibility checking.
 * 
 * Purpose:
 * This program collects ages of 10 students and determines their voting eligibility.
 * A student can vote if their age is 18 or older. Invalid (negative) ages are flagged.
 * 
 * Concepts Demonstrated:
 * - Integer Arrays: Stores age values for 10 students
 * - Input Collection: Uses loop to gather data for multiple records
 * - Conditional Logic: Uses nested if-else for age validation and eligibility check
 * - Data Validation: Detects and reports invalid negative age values
 * - Threshold-based Decision: Uses comparison operator for eligibility determination
 */
public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        // Collect ages of 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            // First check if age is valid (non-negative)
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } 
            // Check if age meets voting eligibility requirement (18 or older)
            else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote");
            }
        }
    }
}