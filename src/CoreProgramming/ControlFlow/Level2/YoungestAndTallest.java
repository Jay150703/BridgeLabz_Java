package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

/**
 * YoungestAndTallest class demonstrates comparing multiple values across different categories.
 * 
 * Purpose:
 * This program reads the ages and heights of three people, then identifies
 * the youngest person and the tallest person.
 * 
 * Concepts Demonstrated:
 * - Multiple Comparisons: Compares three different values in each category
 * - Nested Conditionals: Uses if-else if-else to check all possibilities
 * - Logical AND Operator: Combines conditions to verify one person has the extrema
 * - Data Separation: Maintains and compares different attributes independently
 */
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read ages of three people
        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        // Read heights of three people
        int amarHeight = sc.nextInt();
        int akbarHeight = sc.nextInt();
        int anthonyHeight = sc.nextInt();

        // Find and display the youngest person
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        // Find and display the tallest person
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is the tallest");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
    }
}
