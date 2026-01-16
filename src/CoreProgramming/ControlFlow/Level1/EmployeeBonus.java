package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

/**
 * EmployeeBonus class demonstrates conditional bonus calculation based on tenure.
 * 
 * Purpose:
 * This program reads an employee's salary and years of service, then calculates
 * a 5% bonus if the employee has worked for more than 5 years.
 * 
 * Concepts Demonstrated:
 * - Conditional Statement: Uses if-else to determine eligibility
 * - Comparison Operator: Uses > to check service duration threshold
 * - Percentage Calculation: Multiplies salary by 0.05 (5%) to compute bonus
 * - Numeric Computation: Performs arithmetic operations on floating-point numbers
 */
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int years = sc.nextInt();

        // Check if employee has served more than 5 years for bonus eligibility
        if (years > 5) {
            // Calculate 5% bonus on salary
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
