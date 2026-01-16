package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

/**
 * DivisibleByFive class demonstrates basic conditional logic with the modulo operator.
 * 
 * Purpose:
 * This program checks if a given number is divisible by 5 and displays the result.
 * 
 * Concepts Demonstrated:
 * - Conditional Statements: Uses if-else to make binary decision
 * - Modulo Operator: Uses % to check divisibility (number % 5 == 0)
 * - User Input: Reads integer input using Scanner
 * - Boolean Logic: Evaluates a condition to produce a true/false outcome
 */
public class DivisibleByFive {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
        // Check if the number is divisible by 5 using modulo operator
        if ( number % 5 == 0 )
           System.out.println("Is the number " + number + " divisible by 5 ? true");
       else
           System.out.println("\"Is the number " + number + " divisible by 5 ? false");
    }
}
