package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

/**
 * StudentGrades class demonstrates grade calculation and classification based on percentages.
 * 
 * Purpose:
 * This program calculates the average percentage for each student based on three subject
 * marks (Physics, Chemistry, Maths) and assigns a letter grade based on the percentage.
 * 
 * Concepts Demonstrated:
 * - Parallel Arrays: Uses separate arrays for percentages and grades
 * - Statistical Calculation: Computes average of three values
 * - Conditional Grading: Uses threshold-based if-else for grade assignment
 * - Data Classification: Categorizes numerical scores into letter grades
 * - Formatted Output: Displays results with student numbers and calculated values
 */
public class StudentGrades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Collect marks and calculate percentage and grade for each student
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics, Chemistry, Maths marks: ");
            double p = sc.nextDouble();
            double c = sc.nextDouble();
            double m = sc.nextDouble();

            // Calculate average percentage of three subjects
            percentage[i] = (p + c + m) / 3;

            // Assign letter grade based on percentage thresholds
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else grade[i] = "D";
        }

        // Display results for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }
    }
}