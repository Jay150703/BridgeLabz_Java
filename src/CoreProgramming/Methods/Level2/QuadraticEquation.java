package CoreProgramming.Methods.Level2;

import java.util.Scanner;

/**
 * QuadraticEquation class demonstrates conditional array sizing and mathematical formulas.
 * 
 * Purpose:
 * This program solves quadratic equations (ax² + bx + c = 0) using the quadratic formula
 * and returns roots as an array. Array size varies based on number of real roots.
 * 
 * Concepts Demonstrated:
 * - Discriminant Calculation: Determines type of roots using delta
 * - Conditional Array Sizing: Returns different sized arrays based on conditions
 * - Mathematical Formula: Implements quadratic formula with square root
 * - Edge Cases: Handles no real roots and single root scenarios
 * - Array Return Variation: Returns 0, 1, or 2 element array
 */
public class QuadraticEquation {

    // Method to find roots of quadratic equation ax² + bx + c = 0
    public static double[] findRoots(double a, double b, double c) {

        // Calculate discriminant (delta)
        double delta = b * b - 4 * a * c;

        // If delta is negative, no real roots exist
        if (delta < 0)
            return new double[0];

        // If delta is zero, only one root exists
        if (delta == 0)
            return new double[]{-b / (2 * a)};

        // If delta is positive, two distinct roots exist
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{root1, root2};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a b c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Find roots using quadratic formula
        double[] roots = findRoots(a, b, c);

        // Display results based on number of roots found
        if (roots.length == 0)
            System.out.println("No real roots");
        else
            for (double r : roots)
                System.out.println("Root: " + r);
    }
}