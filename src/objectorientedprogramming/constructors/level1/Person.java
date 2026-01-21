package objectorientedprogramming.constructors.level1;

/*
 * Program: Person Copy Constructor
 * Description: Copies attributes from another object.
 */
public class Person {

    // Person name
    String name;

    // Person age
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Original object
        Person p1 = new Person("Jayanthi", 21);

        // Copied object
        Person p2 = new Person(p1);

        p2.displayDetails();
    }
}
