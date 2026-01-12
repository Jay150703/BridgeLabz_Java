package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {

        double side1, side2, side3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 in meters: ");
        side1 = input.nextDouble();

        System.out.print("Enter side 2 in meters: ");
        side2 = input.nextDouble();

        System.out.print("Enter side 3 in meters: ");
        side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds);
    }

}
