package coreprogramming.controlflow.level1;
import java.util.Scanner;

/**
 * LargestOfThree class demonstrates nested conditional logic for comparison.
 * 
 * Purpose:
 * This program reads three numbers and determines which one is the largest.
 * 
 * Concepts Demonstrated:
 * - Nested Conditional Statements: Uses multiple if-else if blocks to check all cases
 * - Logical AND Operator: Combines multiple conditions to identify the largest value
 * - Comparison Operators: Uses > to compare numeric values
 * - Value Comparison: Tests all possible orderings to find maximum
 */
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        // Check if a is greater than both b and c
        if (a > b && a > c) {
            System.out.println("a is the largest");
        } else if (b > a && b > c) {
            System.out.println("b is the largest");
        } else  {
            System.out.println("c is the largest");
        }
    }
}
