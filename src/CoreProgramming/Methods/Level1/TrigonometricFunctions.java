package CoreProgramming.Methods.Level1;

import java.util.Scanner;

/**
 * TrigonometricFunctions class demonstrates built-in Math methods and array return.
 * 
 * Purpose:
 * This program calculates sine, cosine, and tangent of a given angle in degrees
 * using Java's Math class methods and returns all three values in an array.
 * 
 * Concepts Demonstrated:
 * - Math Class Methods: Uses Math.sin(), Math.cos(), Math.tan()
 * - Degree to Radian Conversion: Uses Math.toRadians() for conversion
 * - Double Array Return: Returns multiple floating-point values
 * - Built-in Libraries: Leverages Java's mathematical functions
 * - Array-based Multiple Returns: Returns three trigonometric values
 */
public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric functions using Math class
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // Return all three values as array
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Call method to calculate trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sin = " + result[0]);
        System.out.println("Cos = " + result[1]);
        System.out.println("Tan = " + result[2]);
    }
}