package CoreProgramming.Methods.Level1;

import java.util.Scanner;

/**
 * SimpleInterest class demonstrates financial calculation using a dedicated method.
 * 
 * Purpose:
 * This program calculates simple interest using the formula SI = (P × R × T) / 100,
 * where P is principal, R is rate, and T is time.
 * 
 * Concepts Demonstrated:
 * - Method Definition: Defines static method with multiple double parameters
 * - Mathematical Calculation: Applies financial formula with multiple operations
 * - Double Return Type: Returns floating-point result for precision
 * - Parameter Passing: Accepts three financial parameters
 * - Formula Application: Encapsulates interest calculation logic
 */
public class SimpleInterest {

    // Method to calculate simple interest using formula SI = (P * R * T) / 100
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Apply simple interest formula
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        // Call method with financial parameters
        double si = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}