package objectorientedprogramming.bestprogrammingpractices.encapsulation;

/*
 * Class: Employee
 * Description: Demonstrates encapsulation using private fields
 * with getters and setters including validation.
 */
public class Employee {

    // Private fields (data hiding)
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        setSalary(salary);
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter with validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }
}
