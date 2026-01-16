package CoreProgramming.Methods.Level3;

/**
 * MatrixOperations class demonstrates 2D array operations for matrices.
 * 
 * Purpose:
 * This utility class provides methods to generate random matrices and perform
 * matrix addition on two-dimensional arrays.
 * 
 * Concepts Demonstrated:
 * - Random Matrix Generation: Creates matrices with random values
 * - 2D Array Processing: Iterates through rows and columns
 * - Matrix Addition: Adds corresponding elements of two matrices
 * - Nested Loops: Uses nested loops for 2D array traversal
 * - Array Return: Returns 2D arrays from methods
 */
public class MatrixOperations {

    // Method to generate random matrix with values 0-9
    public static int[][] randomMatrix(int r,int c) {
        int[][] m = new int[r][c];
        // Iterate through all rows and columns
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                // Fill with random integers 0-9
                m[i][j]=(int)(Math.random()*10);
        return m;
    }

    // Method to add two matrices element-wise
    public static int[][] add(int[][] a,int[][] b) {
        // Create result matrix with same dimensions
        int[][] r=new int[a.length][a[0].length];
        // Iterate through all elements
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                // Add corresponding elements
                r[i][j]=a[i][j]+b[i][j];
        return r;
    }
}