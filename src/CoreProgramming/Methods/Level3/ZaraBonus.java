package CoreProgramming.Methods.Level3;

/**
 * ZaraBonus class demonstrates bonus calculation based on years of service.
 * 
 * Purpose:
 * This class generates salary and years of service data for employees and calculates
 * their bonus based on tenure: 5% for >5 years, 2% otherwise.
 * 
 * Concepts Demonstrated:
 * - Salary Data Generation: Creates realistic salary ranges
 * - Conditional Bonus Calculation: Uses ternary operator for logic
 * - Years-based Decision: Applies different percentages based on tenure
 * - 2D Array Result: Returns updated salary and bonus amounts
 * - Type Casting: Converts between int and double for calculations
 */
public class ZaraBonus {

    // Method to generate random salary and years of service data
    public static double[][] generateData() {
        // Create data matrix for 10 employees [salary, years]
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            // Generate salary in range 10000-99999
            data[i][0] = 10000 + Math.random()*90000; // salary
            // Generate years of service 0-10
            data[i][1] = Math.random()*10; // years
        }
        return data;
    }

    // Method to calculate new salary and bonus amount
    public static double[][] calculate(double[][] data) {
        // Create result matrix for 10 employees [new salary, bonus]
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            // Determine bonus: 5% if years > 5, else 2%
            double bonus = data[i][1] > 5 ? data[i][0]*0.05 : data[i][0]*0.02;
            // Calculate new salary after bonus
            result[i][0] = data[i][0] + bonus;
            // Store bonus amount
            result[i][1] = bonus;
        }
        return result;
    }
}