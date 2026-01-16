package CoreProgramming.Methods.Level2;

import java.util.Scanner;

/**
 * FactorsOperations class demonstrates multiple methods operating on extracted data.
 * 
 * Purpose:
 * This program finds all factors of a number and then performs multiple operations
 * (sum, product, sum of squares) on the extracted factors.
 * 
 * Concepts Demonstrated:
 * - Dynamic Array Sizing: First counts, then creates appropriately sized array
 * - Multiple Processing Methods: Different methods for different calculations
 * - Array as Parameter: Passes extracted array to multiple methods
 * - Accumulation Pattern: Uses different accumulation strategies
 * - Method Chaining Logic: Result of one method used by others
 */
public class FactorsOperations {

    // Method to find all factors of a number
    public static int[] findFactors(int number) {

        // First pass: count number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        // Create array with exact size needed
        int[] factors = new int[count];
        int index = 0;

        // Second pass: populate array with factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                factors[index++] = i;
        }
        return factors;
    }

    // Method to calculate sum of all factors
    public static int findSum(int[] factors) {
        int sum = 0;
        // Use enhanced for loop to iterate through factors
        for (int f : factors)
            sum += f;
        return sum;
    }

    // Method to calculate product of all factors
    public static int findProduct(int[] factors) {
        int product = 1;
        // Multiply each factor to get product
        for (int f : factors)
            product *= f;
        return product;
    }

    // Method to calculate sum of squares of all factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        // Square each factor and add to sum
        for (int f : factors)
            sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find factors using dedicated method
        int[] factors = findFactors(number);

        // Display extracted factors
        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");

        // Display results from all computation methods
        System.out.println("\nSum = " + findSum(factors));
        System.out.println("Product = " + findProduct(factors));
        System.out.println("Sum of Squares = " + findSumOfSquares(factors));
    }
}