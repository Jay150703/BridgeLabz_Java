package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class BMIUsing2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight: ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height: ");
            personData[i][1] = sc.nextDouble();

            double h = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (h * h);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + "\t" +
                    personData[i][0] + "\t" +
                    String.format("%.2f", personData[i][2]) + "\t" +
                    status[i]);
        }
    }
}
