package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

/**
 * LeapYearIfElse class demonstrates complex conditional logic for leap year determination.
 * 
 * Purpose:
 * This program reads a year and determines if it is a leap year using nested if-else statements.
 * Leap year rules: divisible by 400 is leap, divisible by 100 is not, divisible by 4 is leap.
 * 
 * Concepts Demonstrated:
 * - Multi-branch Conditionals: Uses sequential if-else if for multiple exclusive conditions
 * - Gregorian Calendar Validation: Checks if year >= 1582
 * - Modulo Operator: Checks divisibility by 4, 100, and 400
 * - Order-dependent Logic: Checks most restrictive conditions first
 */
public class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // Check if year is before Gregorian calendar introduction
        if (year < 1582) {
            System.out.println("Year is not in Gregorian calendar");
        // Check if divisible by 400 (leap year exception to exception)
        } else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        // Check if divisible by 100 (not a leap year)
        } else if (year % 100 == 0) {
            System.out.println("Year is not a Leap Year");
        // Check if divisible by 4 (leap year)
        } else if (year % 4 == 0) {
            System.out.println("Year is a Leap Year");
        // All other years are not leap years
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
