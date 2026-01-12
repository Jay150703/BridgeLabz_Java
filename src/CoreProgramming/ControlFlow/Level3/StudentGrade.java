package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter physics score : ");
        int physics = sc.nextInt();
        System.out.print("Enter chemistry score :");
        int chemistry = sc.nextInt();
        System.out.print("Enter maths score :");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("Average Mark: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A | Remark: Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade: B | Remark: Very Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: C | Remark: Good");
        } else if (percentage >= 40) {
            System.out.println("Grade: D | Remark: Pass");
        } else {
            System.out.println("Grade: F | Remark: Fail");
        }
    }
}
