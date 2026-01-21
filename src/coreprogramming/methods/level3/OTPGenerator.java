package coreprogramming.methods.level3;

/**
 * OTPGenerator class demonstrates random number generation and uniqueness checking.
 * 
 * Purpose:
 * This program generates random 6-digit OTP (One-Time Password) numbers and verifies
 * that all generated OTPs are unique without duplicates.
 * 
 * Concepts Demonstrated:
 * - Random Number Generation: Uses Math.random() for OTP generation
 * - OTP Range: Generates 6-digit numbers (100000-999999)
 * - Uniqueness Verification: Checks for duplicate values
 * - Nested Loop Comparison: Compares all pairs of values
 * - Array-based Storage: Stores multiple OTPs for verification
 */
public class OTPGenerator {

    // Method to generate single random 6-digit OTP
    public static int generateOTP() {
        // Generate number in range 100000-999999
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to verify all OTPs in array are unique
    public static boolean areUnique(int[] otps) {
        // Compare each OTP with all following OTPs
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                // If any duplicate found, return false
                if (otps[i] == otps[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        // Generate 10 random OTPs
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        // Check and display uniqueness result
        System.out.println("All OTPs Unique: " + areUnique(otps));
    }
}