package ObjectOrientedProgramming.Fundamentals.Level1;

/*
 * Program: Circle Area and Circumference
 * Description: Calculates area and circumference of a circle.
 */
public class Circle {

    // Radius of the circle
    double radius;

    // Method to calculate area
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Method to calculate circumference
    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {
        // Creating Circle object
        Circle circle = new Circle();

        // Assigning radius
        circle.radius = 7;

        // Calculations
        circle.calculateArea();
        circle.calculateCircumference();
    }
}
