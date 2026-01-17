package ObjectOrientedProgramming.Constructors.Level1;

/*
 * Program: Circle Constructor Chaining
 * Description: Uses constructor chaining to initialize radius.
 */
public class Circle {

    // Radius of the circle
    double radius;

    // Default constructor
    Circle() {
        this(5); // Calling parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        // Using default constructor
        Circle c1 = new Circle();
        c1.calculateArea();

        // Using parameterized constructor
        Circle c2 = new Circle(7);
        c2.calculateArea();
    }
}
