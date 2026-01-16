package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

/**
 * BMICalculation class demonstrates parallel array processing for health metrics calculation.
 * 
 * Purpose:
 * This program calculates Body Mass Index (BMI) for multiple persons using separate arrays
 * for weight, height, BMI, and health status. It classifies each person into a BMI category.
 * 
 * Concepts Demonstrated:
 * - Multiple Parallel Arrays: Uses separate arrays to store related data for each person
 * - Array Initialization: Creates arrays sized based on user input
 * - Mathematical Computation: Calculates BMI using formula (weight / (height in meters)^2)
 * - Conditional Classification: Uses if-else to determine health status from BMI values
 * - Data Formatting: Uses String.format() for precise decimal output
 * - Indexed Access: Accesses elements at matching indices across multiple arrays
 */
public class BMICalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Collect weight and height for each person and calculate BMI
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            height[i] = sc.nextDouble();

            // Convert height from cm to meters for BMI calculation
            double h = height[i] / 100;
            bmi[i] = weight[i] / (h * h);

            // Classify BMI into health status categories
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        // Display results in formatted table
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "\t" + weight[i] + "\t" +
                    String.format("%.2f", bmi[i]) + "\t" + status[i]);
        }
    }
}