package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {

        String name, fromCity, viaCity, toCity;
        double fromToVia, viaToFinalCity, timeTaken;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = input.nextLine();

        System.out.print("Enter from city: ");
        fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        viaCity = input.nextLine();

        System.out.print("Enter to city: ");
        toCity = input.nextLine();

        System.out.print("Enter distance from to via (miles): ");
        fromToVia = input.nextDouble();

        System.out.print("Enter distance from via to final city (miles): ");
        viaToFinalCity = input.nextDouble();

        System.out.print("Enter time taken (hours): ");
        timeTaken = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / timeTaken;

        System.out.println("Name: " + name);
        System.out.println("From " + fromCity + " to " + toCity +
                " via " + viaCity);
        System.out.println("Total Distance: " + totalDistance);
        System.out.println("Average Speed: " + speed);
    }

}
