package CoreProgramming.Methods.Level3;

public class ZaraBonus {

    public static double[][] generateData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + Math.random()*90000; // salary
            data[i][1] = Math.random()*10; // years
        }
        return data;
    }

    public static double[][] calculate(double[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus = data[i][1] > 5 ? data[i][0]*0.05 : data[i][0]*0.02;
            result[i][0] = data[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }
}
