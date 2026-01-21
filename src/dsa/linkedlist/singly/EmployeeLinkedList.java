package dsa.linkedlist.singly;

/*
 * EmployeeLinkedList
 * -------------------
 * This program demonstrates the implementation of a
 * Singly Linked List to manage employee records.
 *
 * Each node stores employee details such as:
 * ID, Name, Department, and Salary.
 *
 * Operations supported:
 * 1. Add employee at the beginning
 * 2. Add employee at the end
 * 3. Delete employee by ID
 * 4. Search employee by ID
 * 5. Display all employee records
 *
 * This program helps understand:
 * - Singly Linked List structure
 * - Dynamic memory allocation
 * - Traversal, insertion, and deletion logic
 */

public class EmployeeLinkedList {

    /* ---------- Node Definition ---------- */
    static class EmployeeNode {
        int id;
        String name;
        String department;
        double salary;
        EmployeeNode next; // Reference to next node

        // Constructor to initialize employee details
        EmployeeNode(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.next = null;
        }
    }

    // Head pointer pointing to the first node of the list
    private EmployeeNode head;

    /* ---------- Insert Operations ---------- */

    // Add employee at the beginning of the list
    public void addAtBeginning(int id, String name, String dept, double salary) {
        EmployeeNode newNode = new EmployeeNode(id, name, dept, salary);
        newNode.next = head; // Point new node to old head
        head = newNode;      // Update head
    }

    // Add employee at the end of the list
    public void addAtEnd(int id, String name, String dept, double salary) {
        EmployeeNode newNode = new EmployeeNode(id, name, dept, salary);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse till the last node
        EmployeeNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Attach new node at the end
        temp.next = newNode;
    }

    /* ---------- Delete Operation ---------- */

    // Delete employee record by ID
    public void deleteById(int id) {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If head node needs to be deleted
        if (head.id == id) {
            head = head.next;
            System.out.println("Employee deleted");
            return;
        }

        // Traverse to find the node before the target node
        EmployeeNode temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        // If employee not found
        if (temp.next == null) {
            System.out.println("Employee not found");
        } else {
            temp.next = temp.next.next; // Skip the node
            System.out.println("Employee deleted");
        }
    }

    /* ---------- Search Operation ---------- */

    // Search employee by ID
    public void searchById(int id) {
        EmployeeNode temp = head;

        // Traverse the list
        while (temp != null) {
            if (temp.id == id) {
                System.out.println(
                        "ID: " + temp.id +
                                ", Name: " + temp.name +
                                ", Department: " + temp.department +
                                ", Salary: " + temp.salary
                );
                return;
            }
            temp = temp.next;
        }

        // If employee not found
        System.out.println("Employee not found");
    }

    /* ---------- Display Operation ---------- */

    // Display all employee records
    public void display() {

        // If list is empty
        if (head == null) {
            System.out.println("No employee records available");
            return;
        }

        EmployeeNode temp = head;

        // Traverse and print each node
        while (temp != null) {
            System.out.println(
                    "ID: " + temp.id +
                            ", Name: " + temp.name +
                            ", Department: " + temp.department +
                            ", Salary: " + temp.salary
            );
            temp = temp.next;
        }
    }

    /* ---------- Main Method (Testing) ---------- */

    public static void main(String[] args) {

        // Create linked list object
        EmployeeLinkedList list = new EmployeeLinkedList();

        // Adding employee records
        list.addAtBeginning(101, "Jayanthi", "IT", 45000);
        list.addAtEnd(102, "Arun", "HR", 40000);
        list.addAtEnd(103, "Meena", "Finance", 50000);

        // Display all records
        System.out.println("Employee Records:");
        list.display();

        // Search operation
        System.out.println("\nSearching for employee with ID 102:");
        list.searchById(102);

        // Delete operation
        System.out.println("\nDeleting employee with ID 101:");
        list.deleteById(101);

        // Display updated list
        System.out.println("\nUpdated Employee Records:");
        list.display();
    }
}
