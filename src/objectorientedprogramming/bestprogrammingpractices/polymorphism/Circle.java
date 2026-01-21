package objectorientedprogramming.bestprogrammingpractices.polymorphism;

/*
 * Class: Circle
 * Description: Overrides area calculation.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
