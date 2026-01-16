package CoreProgramming.Methods.Level1;

import java.util.Scanner;

/**
 * ChocolateDistribution class demonstrates methods returning arrays with multiple values.
 * 
 * Purpose:
 * This program distributes chocolates equally among children and calculates how many
 * chocolates each child gets and how many remain, using a method that returns an array.
 * 
 * Concepts Demonstrated:
 * - Array Return: Method returns an array containing multiple computed values
 * - Integer Division: Uses / operator to find quotient
 * - Modulo Operator: Uses % operator to find remainder
 * - Array Initialization: Creates and returns array in single expression
 * - Multiple Return Values: Demonstrates returning more than one value via array
 */
public class ChocolateDistribution {

    // Method to calculate quotient and remainder, returning both in an array
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        // Calculate quotient (chocolates per child)
        int eachGets = chocolates / children;
        // Calculate remainder (leftover chocolates)
        int remaining = chocolates % children;
        // Return both values as array
        return new int[]{eachGets, remaining};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        // Call method and receive array with quotient and remainder
        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}