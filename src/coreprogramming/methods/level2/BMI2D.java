package coreprogramming.methods.level2;

import java.util.Scanner;

/**
 * BMI2D class demonstrates method-based 2D array processing and separation of concerns.
 * 
 * Purpose:
 * This program calculates Body Mass Index (BMI) for 10 people using separate methods
 * for calculation and status determination. Uses a 2D array to store weight, height, and BMI.
 * 
 * Concepts Demonstrated:
 * - 2D Array Processing: Passes 2D array to methods for computation
 * - Method Composition: Uses multiple methods to process different aspects
 * - Array Modification: Modifies array elements within method
 * - String Array Return: Returns array of classification strings
 * - Separation of Concerns: Divides logic into focused methods
 */
public class BMI2D {

    // Method to calculate BMI for all persons in 2D array
    public static void calculateBMI(double[][] data) {

        // Iterate through each person's data row
        for (int i = 0; i < data.length; i++) {
            // Convert height from cm to meters
            double heightMeters = data[i][1] / 100;
            // Calculate BMI and store in third column
            data[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
    }

    // Method to determine health status based on BMI values
    public static String[] getStatus(double[][] data) {

        String[] status = new String[data.length];

        // Classify each person's BMI into health category
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            // Assign status based on BMI thresholds
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 2D array: each row is a person, columns are [weight, height, BMI]
        double[][] persons = new double[10][3];

        // Collect weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight: ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height: ");
            persons[i][1] = sc.nextDouble();
        }

        // Calculate BMI for all persons
        calculateBMI(persons);
        // Get health status for all persons
        String[] status = getStatus(persons);

        // Display results in table format
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(persons[i][0] + "\t" +
                    persons[i][1] + "\t" +
                    String.format("%.2f", persons[i][2]) + "\t" +
                    status[i]);
        }
    }
}