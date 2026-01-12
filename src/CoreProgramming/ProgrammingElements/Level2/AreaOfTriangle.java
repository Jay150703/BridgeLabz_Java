package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        double base, height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " +
                areaInch + " and sq cm is " + areaCm);

    }
}
