package CoreProgramming.Methods.Level3;

/**
 * CollinearCheck class demonstrates geometric algorithms for checking collinearity.
 * 
 * Purpose:
 * This class provides two different methods to determine if three points are collinear
 * (lying on the same line): one using slope comparison and one using area calculation.
 * 
 * Concepts Demonstrated:
 * - Slope Method: Compares slopes between point pairs
 * - Area Method: Uses coordinate geometry to calculate triangle area
 * - Geometric Properties: Applies mathematical properties of collinear points
 * - Alternative Algorithms: Demonstrates multiple approaches to same problem
 * - Integer Arithmetic: Uses integer operations to avoid floating-point errors
 */
public class CollinearCheck {

    // Method to check collinearity using slope comparison
    public static boolean bySlope(int x1,int y1,int x2,int y2,int x3,int y3) {
        // Three points are collinear if slopes between (p1,p2) and (p2,p3) are equal
        // Avoid division by using cross multiplication: (y2-y1)/(x2-x1) == (y3-y2)/(x3-x2)
        return (y2-y1)*(x3-x2) == (y3-y2)*(x2-x1);
    }

    // Method to check collinearity using area calculation
    public static boolean byArea(int x1,int y1,int x2,int y2,int x3,int y3) {
        // Three points are collinear if the triangle area is zero
        double area = 0.5 * (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area == 0;
    }
}