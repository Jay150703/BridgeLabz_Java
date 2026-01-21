package coreprogramming.methods.level1;

/**
 * SpringSeason class demonstrates boolean return type for date-based validation.
 * 
 * Purpose:
 * This program determines whether a given date (month and day) falls within the spring
 * season (March 20 through June 20) using a helper method that returns a boolean.
 * 
 * Concepts Demonstrated:
 * - Boolean Return Type: Method returns true/false for validation
 * - Complex Conditions: Uses logical operators to check date ranges
 * - Command-line Arguments: Accepts input via command-line parameters
 * - Integer Parsing: Converts string arguments to integers
 * - Conditional Date Logic: Checks both month and day boundaries
 */
public class SpringSeason {

    // Method to check if date falls within spring season (March 20 - June 20)
    public static boolean isSpringSeason(int month, int day) {

        // Check if date is within spring season boundaries
        if ((month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Parse command-line arguments for month and day
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call method to check if date is in spring season
        if (isSpringSeason(month, day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}