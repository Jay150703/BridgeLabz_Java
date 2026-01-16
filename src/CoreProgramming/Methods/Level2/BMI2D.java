package CoreProgramming.Methods.Level2;

import java.util.Scanner;

public class BMI2D {

    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double heightMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
    }

    public static String[] getStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight: ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height: ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);
        String[] status = getStatus(persons);

        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(persons[i][0] + "\t" +
                    persons[i][1] + "\t" +
                    String.format("%.2f", persons[i][2]) + "\t" +
                    status[i]);
        }
    }
}
