package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

/**
 * SpringSeason class demonstrates complex conditional logic with date range validation.
 * 
 * Purpose:
 * This program reads a month and day, then determines if the date falls within the spring season
 * (March 20 to June 20).
 * 
 * Concepts Demonstrated:
 * - Complex Logical Operators: Uses && and || to combine multiple conditions
 * - Date Range Validation: Checks if a date falls within specified boundaries
 * - Nested Conditions: Evaluates different conditions based on month and day values
 */
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        // Check if date is within spring season (March 20 - June 20)
        if ((month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20)) {

            System.out.println("It is a Spring Season");
        } else {
            System.out.println("It is not a Spring Season");
        }
    }
}
