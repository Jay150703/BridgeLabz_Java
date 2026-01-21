package coreprogramming.arrays.level2;

import java.util.Scanner;

/**
 * EmployeeBonus class demonstrates conditional bonus calculation and data aggregation.
 * 
 * Purpose:
 * This program calculates bonuses for 10 employees based on their years of service.
 * Employees with more than 5 years get 5% bonus, otherwise 2%, and totals are displayed.
 * 
 * Concepts Demonstrated:
 * - Multiple Parallel Arrays: Stores salary, years of service, bonus, and new salary
 * - Input Validation: Checks for invalid inputs and re-prompts on error
 * - Conditional Bonus Calculation: Uses if-else to determine bonus percentage
 * - Accumulation: Uses variables to sum bonuses and salaries
 * - Data Processing: Processes multiple records using loops
 */
public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Collect salary and years of service for 10 employees with validation
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextDouble();

            // Validate input and re-prompt if invalid
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }
        }

        // Calculate bonus based on years of service and compute new salary
        for (int i = 0; i < 10; i++) {
            // Bonus is 5% if more than 5 years, otherwise 2%
            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            // Calculate new salary after bonus
            newSalary[i] = salary[i] + bonus[i];

            // Accumulate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display accumulated totals
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}