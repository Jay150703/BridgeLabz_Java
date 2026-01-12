package CoreProgramming.ProgrammingElements.Level1;
import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {

        int numberOfStudents;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes is " + handshakes);
    }

}
