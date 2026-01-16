package CoreProgramming.Methods.Level2;

/**
 * UnitConverter class demonstrates bidirectional conversion methods for distance units.
 * 
 * Purpose:
 * This class provides static methods to convert between different distance units:
 * kilometers/miles and meters/feet. Methods are stateless utility functions.
 * 
 * Concepts Demonstrated:
 * - Conversion Factors: Uses precise mathematical conversion ratios
 * - Bidirectional Methods: Provides both forward and reverse conversions
 * - Static Utility Methods: All methods are static for direct access
 * - No Main Method: Designed as utility class for use by other classes
 * - Double Return Type: Returns floating-point values for precision
 */
public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        // Conversion factor: 1 km = 0.621371 miles
        return km * 0.621371;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        // Conversion factor: 1 mile = 1.60934 km
        return miles * 1.60934;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        // Conversion factor: 1 meter = 3.28084 feet
        return meters * 3.28084;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        // Conversion factor: 1 foot = 0.3048 meters
        return feet * 0.3048;
    }
}