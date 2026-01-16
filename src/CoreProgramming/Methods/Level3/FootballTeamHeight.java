package CoreProgramming.Methods.Level3;

/**
 * FootballTeamHeight class demonstrates statistical calculations on array data.
 * 
 * Purpose:
 * This program calculates various statistics (sum, mean, minimum, maximum) for heights
 * of 11 football players using helper methods with randomly generated height data.
 * 
 * Concepts Demonstrated:
 * - Accumulation: Uses sum variable to calculate total
 * - Statistical Mean: Calculates average by dividing sum by count
 * - Extrema Finding: Finds minimum and maximum values
 * - Method Decomposition: Breaks calculations into focused methods
 * - Random Data Generation: Creates realistic test data
 */
public class FootballTeamHeight {

    // Method to calculate sum of all heights
    public static int sum(int[] heights) {
        int s = 0;
        // Accumulate all height values
        for (int h : heights) s += h;
        return s;
    }

    // Method to calculate mean (average) height
    public static double mean(int[] heights) {
        // Mean equals sum divided by number of elements
        return (double) sum(heights) / heights.length;
    }

    // Method to find shortest player height
    public static int shortest(int[] heights) {
        int min = heights[0];
        // Find minimum height value
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    // Method to find tallest player height
    public static int tallest(int[] heights) {
        int max = heights[0];
        // Find maximum height value
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {

        // Generate random heights for 11 players in range 150-250 cm
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // 150–250
        }

        // Display statistical results
        System.out.println("Shortest = " + shortest(heights));
        System.out.println("Tallest = " + tallest(heights));
        System.out.println("Mean = " + mean(heights));
    }
}