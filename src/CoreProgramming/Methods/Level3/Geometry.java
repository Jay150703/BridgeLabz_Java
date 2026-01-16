package CoreProgramming.Methods.Level3;

/**
 * Geometry class demonstrates geometric calculations for lines and distances.
 * 
 * Purpose:
 * This utility class provides methods to calculate the distance between two points
 * and to find the equation of a line passing through two points.
 * 
 * Concepts Demonstrated:
 * - Distance Formula: Uses Euclidean distance calculation
 * - Line Equation: Calculates slope and y-intercept
 * - Array Return: Returns multiple values (slope and intercept)
 * - Math Class Usage: Uses Math.sqrt and Math.pow
 * - Coordinate Geometry: Applies analytical geometry concepts
 */
public class Geometry {

    // Method to calculate Euclidean distance between two points
    public static double distance(double x1,double y1,double x2,double y2) {
        // Distance = sqrt((x2-x1)² + (y2-y1)²)
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    // Method to find equation of line passing through two points
    public static double[] lineEquation(double x1,double y1,double x2,double y2) {
        // Calculate slope m = (y2-y1)/(x2-x1)
        double m = (y2 - y1) / (x2 - x1);
        // Calculate y-intercept b using point-slope form
        double b = y1 - m * x1;
        // Return as [slope, y-intercept] for y = mx + b
        return new double[]{m, b};
    }
}