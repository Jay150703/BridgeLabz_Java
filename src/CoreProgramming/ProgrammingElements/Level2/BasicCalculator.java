package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        double number1 , number2 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = sc.nextDouble();
        System.out.print("Enter seconf number: ");
        number2 = sc.nextDouble();

        double addition = number1 + number2 ;
        double subtraction = number1 - number2 ;
        double multiplication = number1 * number2 ;
        double division = number1 / number2 ;

        System.out.println("The addition of " + number1 + " and " + number2 + " is " + addition + "\n" +
                " The subtraction of " + number1 + " and " + number2 + " is " + subtraction + "\n" +
                "The multiplication  of " + number1 + " and " + number2 + " is " + multiplication + "\n" +
                        "The division of " + number1 + " and " + number2 + " is " + division );
    }

}
