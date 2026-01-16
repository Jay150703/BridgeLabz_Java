package CoreProgramming.Methods.Level1;

import java.util.Scanner;

/**
 * TriangularParkRun class demonstrates geometric calculation with a method.
 * 
 * Purpose:
 * This program calculates how many complete rounds around a triangular park are needed
 * to cover 5 kilometers, based on the three sides of the triangle.
 * 
 * Concepts Demonstrated:
 * - Perimeter Calculation: Sums the three sides of a triangle
 * - Division for Rounds: Divides total distance by perimeter
 * - Double Return Type: Returns floating-point result for precision
 * - Multiple Parameters: Accepts three side measurements
 * - Geometric Computation: Applies geometric concepts in method
 */
public class TriangularParkRun {

    // Method to calculate number of rounds needed to cover 5 km
    public static double calculateRounds(double side1, double side2, double side3) {
        // Calculate perimeter of triangle
        double perimeter = side1 + side2 + side3;
        // Calculate rounds needed to cover 5000 meters
        return 5000 / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        // Call method to calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds to complete 5 km: " + rounds);
    }
}