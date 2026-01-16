package CoreProgramming.Methods.Level2;

/**
 * RandomArrayStats class demonstrates random number generation and statistical calculations.
 * 
 * Purpose:
 * This program generates an array of random 4-digit numbers and calculates their average,
 * minimum, and maximum values using helper methods.
 * 
 * Concepts Demonstrated:
 * - Random Number Generation: Uses Math.random() to generate numbers in range
 * - Math Class Methods: Uses Math.min() and Math.max() for comparisons
 * - Accumulation: Tracks sum while finding min/max in single pass
 * - Array Generation Method: Encapsulates random array creation
 * - Double Array Return: Returns multiple statistical values
 */
public class RandomArrayStats {

    // Method to generate array of random 4-digit numbers (1000-9999)
    public static int[] generate4DigitRandomArray(int size) {

        int[] arr = new int[size];
        // Generate random numbers in range 1000-9999
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }

    // Method to find average, minimum, and maximum of array
    public static double[] findAverageMinMax(int[] numbers) {

        // Initialize with first element
        int min = numbers[0], max = numbers[0], sum = 0;

        // Single pass: accumulate sum and track min/max
        for (int n : numbers) {
            sum += n;
            // Use Math.min() to update minimum
            min = Math.min(min, n);
            // Use Math.max() to update maximum
            max = Math.max(max, n);
        }

        // Calculate average as double for precision
        double avg = (double) sum / numbers.length;
        // Return all three statistics
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {

        // Generate array of 5 random 4-digit numbers
        int[] numbers = generate4DigitRandomArray(5);
        // Calculate statistics
        double[] result = findAverageMinMax(numbers);

        // Display generated numbers
        System.out.print("Numbers: ");
        for (int n : numbers)
            System.out.print(n + " ");

        // Display calculated statistics
        System.out.println("\nAverage = " + result[0]);
        System.out.println("Min = " + result[1]);
        System.out.println("Max = " + result[2]);
    }
}