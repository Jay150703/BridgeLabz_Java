package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.print("Enter c:");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("a is the smallest");
        } else if (b < a && b < c) {
            System.out.println("b is the smallest");
        } else {
            System.out.println("c is the smallest");
        }
    }

}
