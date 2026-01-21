package coreprogramming.arrays.level2;

import java.util.Scanner;

/**
 * BMIUsing2DArray class demonstrates 2D array usage for storing related numerical data.
 * 
 * Purpose:
 * This program calculates Body Mass Index (BMI) for multiple persons using a single 2D array
 * to store weight, height, and BMI for each person, plus a separate array for health status.
 * 
 * Concepts Demonstrated:
 * - Two-Dimensional Arrays: Uses 2D array to store multiple related metrics per person
 * - Row-based Organization: Each row represents one person with 3 columns for data
 * - Array Column Access: Accesses specific columns (indices) to retrieve related data
 * - Mathematical Computation: Calculates BMI using the standard formula
 * - Conditional Classification: Uses thresholds to determine health status
 * - Data Organization: Demonstrates alternative to parallel arrays for related data
 */
public class BMIUsing2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // 2D array: each row is a person, columns are [weight, height, BMI]
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        // Collect data and calculate BMI for each person
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight: ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height: ");
            personData[i][1] = sc.nextDouble();

            // Convert height from cm to meters and calculate BMI
            double h = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (h * h);

            // Classify health status based on BMI value
            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        // Display results in formatted table
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + "\t" +
                    personData[i][0] + "\t" +
                    String.format("%.2f", personData[i][2]) + "\t" +
                    status[i]);
        }
    }
}