package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

/**
 * YoungestTallest class demonstrates finding multiple extrema across different attributes.
 * 
 * Purpose:
 * This program stores data for three people (Amar, Akbar, Anthony), including their names,
 * ages, and heights, then identifies the youngest person and the tallest person.
 * 
 * Concepts Demonstrated:
 * - Initialized String Array: Pre-populated array with constant values
 * - Parallel Arrays: Maintains corresponding data across multiple arrays
 * - Index-based Tracking: Uses index variables to track extrema
 * - Conditional Comparison: Uses if statements to compare values
 * - Multiple Attribute Tracking: Finds minimum in one array and maximum in another
 */
public class YoungestTallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pre-initialized array with three names
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Collect age and height for each person
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        // Find indices of youngest and tallest persons
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Iterate through remaining persons and update if conditions are met
        for (int i = 1; i < 3; i++) {
            // Check if current person is younger
            if (age[i] < age[youngestIndex])
                youngestIndex = i;
            // Check if current person is taller
            if (height[i] > height[tallestIndex])
                tallestIndex = i;
        }

        // Display results using stored indices
        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }
}