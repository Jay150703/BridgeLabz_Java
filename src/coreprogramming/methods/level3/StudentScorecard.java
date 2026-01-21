package coreprogramming.methods.level3;

/**
 * StudentScorecard class demonstrates scorecard generation and percentage calculation.
 * 
 * Purpose:
 * This class generates random Physics, Chemistry, Math (PCM) scores for students
 * and calculates total, average, and percentage for each student.
 * 
 * Concepts Demonstrated:
 * - Random Score Generation: Creates realistic test scores
 * - 2D Array Processing: Stores scores in matrix format
 * - Statistical Calculations: Computes totals and percentages
 * - Rounding Operations: Uses Math.round for precise percentages
 * - Type Casting: Converts between int and double types
 */
public class StudentScorecard {

    // Method to generate random PCM scores for students
    public static int[][] generatePCM(int n) {
        // Create matrix: n students × 3 subjects
        int[][] m = new int[n][3];
        // Generate random scores 10-99 for each subject
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = 10 + (int)(Math.random()*90);
        return m;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculate(int[][] m) {
        // Create result matrix: n students × [total, average, percentage]
        double[][] r = new double[m.length][3];
        for (int i = 0; i < m.length; i++) {
            // Calculate total of three subjects
            int total = m[i][0]+m[i][1]+m[i][2];
            r[i][0] = total;
            // Calculate average and round to 2 decimal places
            r[i][1] = Math.round((total/3.0)*100)/100.0;
            // Calculate percentage out of 300 and round to 2 decimal places
            r[i][2] = Math.round((total/300.0*100)*100)/100.0;
        }
        return r;
    }
}