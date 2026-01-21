package coreprogramming.programmingelements.level2;
import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {

        double celsius;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        celsius = input.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " celsius is " +
                fahrenheitResult + " fahrenheit");
    }

}
