package ObjectOrientedProgramming.BestProgrammingPractices.Applications;

/*
 * Class: Employee
 * Description: Abstract employee class.
 */
public abstract class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}
