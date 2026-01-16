package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

/**
 * FirstSmallest class demonstrates nested conditional logic for finding minimum value.
 * 
 * Purpose:
 * This program reads three numbers and identifies which one is the smallest.
 * 
 * Concepts Demonstrated:
 * - Nested Conditional Statements: Uses multiple if-else if blocks for comparison
 * - Logical AND Operator: Combines multiple conditions to identify the smallest value
 * - Comparison Operators: Uses < to compare numeric values
 * - Finding Extrema: Implements logic to locate minimum of multiple values
 */
public class FirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.print("Enter c:");
        int c = sc.nextInt();

        // Check if a is smaller than both b and c
        if (a < b && a < c) {
            System.out.println("a is the smallest");
        } else if (b < a && b < c) {
            System.out.println("b is the smallest");
        } else {
            System.out.println("c is the smallest");
        }
    }

}
