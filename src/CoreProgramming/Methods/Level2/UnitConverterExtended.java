package CoreProgramming.Methods.Level2;

/**
 * UnitConverterExtended class provides additional specialized conversion methods.
 * 
 * Purpose:
 * This class offers static utility methods for converting between less common unit pairs:
 * yards/feet, meters/inches, and inches/centimeters for specialized conversion needs.
 * 
 * Concepts Demonstrated:
 * - Extended Unit Set: Provides conversions beyond common units
 * - Specialized Methods: Offers niche conversion pairs
 * - Consistent Naming: Follows bidirectional naming convention
 * - Static Utility Pattern: Provides reusable utility methods
 * - Simple Conversion Factors: Uses straightforward multiplication
 */
public class UnitConverterExtended {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        // Conversion factor: 1 yard = 3 feet
        return yards * 3;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        // Conversion factor: 1 foot = 0.333333 yards (1/3)
        return feet * 0.333333;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        // Conversion factor: 1 meter = 39.3701 inches
        return meters * 39.3701;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        // Conversion factor: 1 inch = 0.0254 meters
        return inches * 0.0254;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        // Conversion factor: 1 inch = 2.54 centimeters
        return inches * 2.54;
    }
}