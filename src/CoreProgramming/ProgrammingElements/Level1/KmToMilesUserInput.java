package CoreProgramming.ProgrammingElements.Level1;
import java.util.Scanner;

public class KmToMilesUserInput {
    public static void main(String[] args){
        double km;
        double miles;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        km = sc.nextInt();

        miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
