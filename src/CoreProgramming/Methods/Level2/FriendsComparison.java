package CoreProgramming.Methods.Level2;

import java.util.Scanner;

/**
 * FriendsComparison class demonstrates finding extrema using dedicated search methods.
 * 
 * Purpose:
 * This program stores data for three friends and uses helper methods to find
 * the youngest person (minimum age) and tallest person (maximum height).
 * 
 * Concepts Demonstrated:
 * - Index-based Extrema: Methods return index of extremum, not the value itself
 * - Array Search Methods: Dedicated methods for finding minimum and maximum
 * - Return Index Strategy: Returns index for flexible use by caller
 * - Method Parameters: Accepts different array types (int and double)
 * - Comparison Logic: Implements min and max finding algorithms
 */
public class FriendsComparison {

    // Method to find index of youngest person (minimum age)
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        // Iterate through ages and track index of minimum value
        for (int i = 1; i < ages.length; i++)
            if (ages[i] < ages[minIndex])
                minIndex = i;
        return minIndex;
    }

    // Method to find index of tallest person (maximum height)
    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        // Iterate through heights and track index of maximum value
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > heights[maxIndex])
                maxIndex = i;
        return maxIndex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Collect data for three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Display results using index from helper methods
        System.out.println("Youngest: " + names[findYoungest(ages)]);
        System.out.println("Tallest: " + names[findTallest(heights)]);
    }
}