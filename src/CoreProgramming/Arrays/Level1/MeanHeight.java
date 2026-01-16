package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

/**
 * MeanHeight class demonstrates basic array operations and statistical calculations.
 * 
 * Purpose:
 * This program calculates the average (mean) height of 11 football players.
 * It collects height inputs in an array and computes the mean value.
 * 
 * Concepts Demonstrated:
 * - Double Arrays: Stores decimal values for precise measurements
 * - Array Initialization: Creates fixed-size array of 11 elements
 * - Accumulation: Uses a sum variable to accumulate values in a loop
 * - Statistical Calculation: Computes mean by dividing total sum by count
 * - Loop Iteration: Iterates through array to collect and process data
 */
public class MeanHeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        // Collect heights from 11 players and calculate running sum
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate mean by dividing total sum by number of players
        double mean = sum / heights.length;
        System.out.println("Mean height of football team: " + mean);
    }
}