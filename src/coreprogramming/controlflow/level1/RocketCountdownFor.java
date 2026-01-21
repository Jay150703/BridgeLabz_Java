package coreprogramming.controlflow.level1;

import java.util.Scanner;

/**
 * RocketCountdownFor class demonstrates backward iteration using a for loop.
 * 
 * Purpose:
 * This program reads a starting number N and displays a countdown from N to 1,
 * simulating a rocket launch countdown sequence.
 * 
 * Concepts Demonstrated:
 * - For Loop with Decrement: Uses i-- to iterate backward
 * - Loop Condition: Uses >= to control iteration from N down to 1
 * - Reverse Order Processing: Displays values in decreasing sequence
 */
public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Count down from N to 1 with decreasing loop variable
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
