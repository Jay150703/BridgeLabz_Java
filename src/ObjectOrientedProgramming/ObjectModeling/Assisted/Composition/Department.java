package ObjectOrientedProgramming.ObjectModeling.Assisted.Composition;

import java.util.ArrayList;

/*
 * Class: Department
 * Description: Represents a department that contains employees.
 */
public class Department {

    // Department name
    String departmentName;

    // Employees in department
    ArrayList<Employee> employees = new ArrayList<>();

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Add employee
    void addEmployee(String name) {
        employees.add(new Employee(name));
    }
}
