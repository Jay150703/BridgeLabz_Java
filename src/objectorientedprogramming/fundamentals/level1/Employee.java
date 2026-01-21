package objectorientedprogramming.fundamentals.level1;

/*
 * Program: Employee Details
 * Description: This program creates an Employee class
 * with attributes and displays employee details.
 */
public class Employee {

    // Employee name
    String name;

    // Employee ID
    int id;

    // Employee salary
    double salary;

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating Employee object
        Employee employee = new Employee();

        // Assigning values
        employee.name = "Jayanthi";
        employee.id = 101;
        employee.salary = 35000;

        // Displaying details
        employee.displayDetails();
    }
}

