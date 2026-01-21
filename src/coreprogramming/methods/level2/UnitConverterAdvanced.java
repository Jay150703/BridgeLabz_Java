package coreprogramming.methods.level2;

/**
 * UnitConverterAdvanced class demonstrates conversion for temperature, weight, and volume.
 * 
 * Purpose:
 * This class provides static utility methods for converting between different units
 * of temperature (Fahrenheit/Celsius), weight (pounds/kilograms), and volume (gallons/liters).
 * 
 * Concepts Demonstrated:
 * - Formula-based Conversions: Uses mathematical formulas for temperature
 * - Multiplication Factor Conversions: Uses simple multiplication for weight/volume
 * - Bidirectional Pairs: Each conversion type has forward and reverse methods
 * - Utility Class Pattern: Provides reusable static methods
 * - Method Specialization: Different conversion types in organized methods
 */
public class UnitConverterAdvanced {

    // Method to convert Fahrenheit to Celsius using formula
    public static double convertFahrenheitToCelsius(double f) {
        // Formula: (F - 32) × 5/9
        return (f - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit using formula
    public static double convertCelsiusToFahrenheit(double c) {
        // Formula: (C × 9/5) + 32
        return (c * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKg(double pounds) {
        // Conversion factor: 1 pound = 0.453592 kg
        return pounds * 0.453592;
    }

    // Method to convert kilograms to pounds
    public static double convertKgToPounds(double kg) {
        // Conversion factor: 1 kg = 2.20462 pounds
        return kg * 2.20462;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        // Conversion factor: 1 gallon = 3.78541 liters
        return gallons * 3.78541;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        // Conversion factor: 1 liter = 0.264172 gallons
        return liters * 0.264172;
    }
}