package coreprogramming.methods.level2;

import java.util.Scanner;

/**
 * StudentVoteChecker class demonstrates voting eligibility validation with error checking.
 * 
 * Purpose:
 * This program checks voting eligibility for 10 students using a helper method that
 * validates both age range and handles invalid negative ages.
 * 
 * Concepts Demonstrated:
 * - Boolean Return: Returns true if eligible, false otherwise
 * - Input Validation: Checks for invalid data (negative ages)
 * - Boundary Checking: Verifies age meets minimum requirement (18+)
 * - Data Integrity: Rejects negative values before eligibility check
 * - Reusable Validation: Method can be called multiple times
 */
public class StudentVoteChecker {

    // Method to check if student can vote with age validation
    public static boolean canStudentVote(int age) {
        // First validate that age is not negative
        if (age < 0)
            return false;
        // Check if age meets voting requirement (18+)
        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        // Check voting eligibility for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            // Display voting eligibility based on method result
            if (canStudentVote(ages[i]))
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }
    }
}