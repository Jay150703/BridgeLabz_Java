package coreprogramming.arrays.level1;

import java.util.Scanner;

/**
 * TwoDToOneD class demonstrates conversion between 2D and 1D array representations.
 * 
 * Purpose:
 * This program takes a 2D matrix input (rows × columns) and converts it into a
 * single 1D array by reading elements row by row and storing them sequentially.
 * 
 * Concepts Demonstrated:
 * - Two-Dimensional Arrays: Creates and populates a 2D matrix structure
 * - One-Dimensional Arrays: Creates corresponding 1D array representation
 * - Nested Loops: Uses nested loops to traverse 2D array elements
 * - Array Flattening: Converts 2D structure into linear 1D array
 * - Index Mapping: Maps 2D coordinates to 1D array positions
 */
public class TwoDToOneD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;

        // Collect matrix elements and simultaneously flatten into 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element: ");
                matrix[i][j] = sc.nextInt();
                // Store each element in 1D array as it's read
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array representation
        System.out.print("1D Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}