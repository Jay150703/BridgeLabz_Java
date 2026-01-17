package ObjectOrientedProgramming.ObjectModeling.Assisted.Composition;

import java.util.ArrayList;

/*
 * Class: Company
 * Description: Company owns departments and employees.
 * Deleting company deletes everything.
 */
public class Company {

    // Company name
    String companyName;

    // Departments in company
    ArrayList<Department> departments = new ArrayList<>();

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
    }

    // Add department
    void addDepartment(Department dept) {
        departments.add(dept);
    }

    public static void main(String[] args) {
        // Creating company
        Company company = new Company("TechCorp");

        // Creating department
        Department dev = new Department("Development");

        // Adding employees
        dev.addEmployee("Alice");
        dev.addEmployee("Bob");

        // Adding department to company
        company.addDepartment(dev);

        System.out.println("Company created with departments and employees");
    }
}
