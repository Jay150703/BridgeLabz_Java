package ObjectOrientedProgramming.Fundamentals.Level2;

/*
 * Program: Student Report
 * Description: Calculates grade based on marks
 * and displays student details.
 */
public class Student {

    // Student name
    String name;

    // Roll number
    int rollNumber;

    // Student marks
    int marks;

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else {
            return 'D';
        }
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        // Creating Student object
        Student student = new Student();

        // Assigning values
        student.name = "Jayanthi";
        student.rollNumber = 21;
        student.marks = 82;

        // Displaying report
        student.displayDetails();
    }
}
