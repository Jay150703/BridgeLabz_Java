package coreprogramming.methods.level3;

/**
 * CalendarDisplay class demonstrates calendar algorithms and mathematical date calculations.
 * 
 * Purpose:
 * This utility class provides methods to determine if a year is a leap year and to calculate
 * what day of the week a given date falls on using mathematical algorithms.
 * 
 * Concepts Demonstrated:
 * - Leap Year Logic: Implements Gregorian calendar leap year rules
 * - Zeller's Congruence: Uses mathematical formula to find day of week
 * - Modular Arithmetic: Uses modulo operations for day calculations
 * - Static Utility Methods: Provides reusable helper methods
 * - Date Mathematics: Applies complex mathematical formulas
 */
public class CalendarDisplay {

    // Method to check if year is a leap year
    static boolean isLeap(int y) {
        // Leap year if divisible by 400 OR (divisible by 4 AND not divisible by 100)
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    // Method to find the first day of given month and year using Zeller's congruence
    static int firstDay(int m, int y) {
        // Adjust month and year for calculation
        int y0 = y - (14 - m) / 12;
        // Calculate century adjustment
        int x = y0 + y0/4 - y0/100 + y0/400;
        // Adjust month value
        int m0 = m + 12*((14-m)/12) - 2;
        // Apply Zeller's formula to find day of week (0=Sunday to 6=Saturday)
        return (1 + x + 31*m0/12) % 7;
    }
}