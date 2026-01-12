package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {

        double weightInPound;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weightInPound = input.nextDouble();

        double weightInKg = weightInPound / 2.2;

        System.out.println("The weight of the person in pound is " +
                weightInPound +
                " and in kg is " + weightInKg);
    }
}
