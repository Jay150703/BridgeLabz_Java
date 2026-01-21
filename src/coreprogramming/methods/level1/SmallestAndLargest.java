package coreprogramming.methods.level1;

import java.util.Scanner;

/**
 * SmallestAndLargest class demonstrates finding multiple extrema using a method.
 * 
 * Purpose:
 * This program finds the smallest and largest of three given numbers using a helper
 * method that returns both extrema in an array.
 * 
 * Concepts Demonstrated:
 * - Method Definition: Method accepts three integer parameters
 * - Comparison Logic: Uses if statements to compare values
 * - Multiple Tracking Variables: Maintains smallest and largest values
 * - Array Return: Returns both extrema as array
 * - Conditional Updates: Updates extrema based on comparisons
 */
public class SmallestAndLargest {

    // Method to find smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {

        // Initialize both with first number
        int smallest = n1;
        int largest = n1;

        // Compare and update smallest if needed
        if (n2 < smallest) smallest = n2;
        if (n3 < smallest) smallest = n3;

        // Compare and update largest if needed
        if (n2 > largest) largest = n2;
        if (n3 > largest) largest = n3;

        // Return both extrema as array
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Call method to find extrema
        int[] result = findSmallestAndLargest(a, b, c);

        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);
    }
}