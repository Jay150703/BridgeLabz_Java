package objectorientedprogramming.bestprogrammingpractices.polymorphism;

/*
 * Class: ShapeTest
 * Description: Demonstrates polymorphism.
 */
public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Circle Area: " + s1.calculateArea());
        System.out.println("Rectangle Area: " + s2.calculateArea());
    }
}
