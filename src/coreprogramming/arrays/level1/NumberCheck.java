package coreprogramming.arrays.level1;

import java.util.Scanner;

/**
 * NumberCheck class demonstrates multi-level conditional logic and array processing.
 * 
 * Purpose:
 * This program analyzes 5 numbers to classify them as positive/negative/zero and
 * even/odd, and compares the first and last elements of the array.
 * 
 * Concepts Demonstrated:
 * - Integer Arrays: Stores 5 integer values
 * - Nested Conditionals: Uses multiple levels of if-else statements
 * - Modulo Operator: Determines even/odd classification using remainder
 * - Array Element Comparison: Compares first and last array elements
 * - Data Classification: Categorizes numbers by multiple attributes
 */
public class NumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Collect 5 numbers from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Classify each number as positive/negative/zero and even/odd
        for (int i = 0; i < numbers.length; i++) {

            // First check if positive, negative, or zero
            if (numbers[i] > 0) {
                // Then check if even or odd
                if (numbers[i] % 2 == 0)
                    System.out.println(numbers[i] + " is Positive and Even");
                else
                    System.out.println(numbers[i] + " is Positive and Odd");
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare first and last array elements
        if (numbers[0] == numbers[4])
            System.out.println("First and Last elements are Equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is Greater");
        else
            System.out.println("Last element is Greater");
    }
}