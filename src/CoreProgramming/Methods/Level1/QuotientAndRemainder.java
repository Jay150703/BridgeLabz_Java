package CoreProgramming.Methods.Level1;

import java.util.Scanner;

/**
 * QuotientAndRemainder class demonstrates division operation and array return values.
 * 
 * Purpose:
 * This program divides two numbers and returns both the quotient and remainder as
 * separate values in an array from a single method call.
 * 
 * Concepts Demonstrated:
 * - Division Operator: Uses / for quotient calculation
 * - Modulo Operator: Uses % for remainder calculation
 * - Array Return: Returns multiple values using array
 * - Method Parameters: Accepts two integer parameters
 * - Value Extraction: Accesses returned array elements by index
 */
public class QuotientAndRemainder {

    // Method to calculate quotient and remainder from division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate quotient using division operator
        int quotient = number / divisor;
        // Calculate remainder using modulo operator
        int remainder = number % divisor;
        // Return both values as an array
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Call method and receive array with quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);
    }
}