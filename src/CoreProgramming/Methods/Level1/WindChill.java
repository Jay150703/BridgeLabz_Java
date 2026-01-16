package CoreProgramming.Methods.Level1;

import java.util.Scanner;

/**
 * WindChill class demonstrates complex mathematical formula implementation.
 * 
 * Purpose:
 * This program calculates wind chill temperature using the meteorological formula:
 * WC = 35.74 + 0.6215T + (0.4275T - 35.75) * (V^0.16)
 * where T is temperature and V is wind speed.
 * 
 * Concepts Demonstrated:
 * - Complex Formula: Implements multi-part mathematical equation
 * - Power Function: Uses Math.pow() for exponentiation
 * - Multiple Operations: Combines addition, multiplication, and exponentiation
 * - Double Parameters: Accepts floating-point temperature and wind speed
 * - Scientific Calculation: Applies real-world meteorological formula
 */
public class WindChill {

    // Method to calculate wind chill temperature using meteorological formula
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Apply wind chill formula with power function
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) *
                        Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();

        // Call method to calculate wind chill
        double windChill = calculateWindChill(temp, windSpeed);
        System.out.println("Wind Chill Temperature = " + windChill);
    }
}