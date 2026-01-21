package coreprogramming.programmingelements.level2;
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        double feet;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards +
                " while the distance in miles is " + miles);
    }

}
