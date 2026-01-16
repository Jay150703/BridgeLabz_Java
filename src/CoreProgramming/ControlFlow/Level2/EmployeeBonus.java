package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

/**
 * EmployeeBonus class demonstrates conditional bonus calculation based on tenure.
 * 
 * Purpose:
 * This program reads an employee's salary and years of service, then calculates
 * a 5% bonus if the employee has worked for more than 5 years.
 * 
 * Concepts Demonstrated:
 * - Conditional Statement: Uses if-else to determine bonus eligibility
 * - Comparison Operator: Uses > to check service duration threshold
 * - Percentage Calculation: Multiplies salary by 0.05 to compute 5% bonus
 * - Numeric Computation: Performs arithmetic on floating-point numbers
 */
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int years = sc.nextInt();

        // Check if employee has worked more than 5 years for bonus eligibility
        if (years > 5) {
            // Calculate 5% bonus on salary
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
