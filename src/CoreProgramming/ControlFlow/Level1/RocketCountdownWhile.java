package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

/**
 * RocketCountdownWhile class demonstrates backward iteration using a while loop.
 * 
 * Purpose:
 * This program reads a starting number and displays a countdown from that number to 1,
 * simulating a rocket launch countdown sequence.
 * 
 * Concepts Demonstrated:
 * - While Loop with Decrement: Uses count-- to iterate backward
 * - Manual Loop Control: Requires explicit variable initialization and modification
 * - Loop Condition: Uses >= to control iteration from N down to 1
 * - Reverse Order Processing: Displays values in decreasing sequence
 */
public class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        // Count down from N to 1 with manual decrement
        while (count >= 1) {
            System.out.println(count);
            // Decrement counter in each iteration
            count--;
        }
    }
}
