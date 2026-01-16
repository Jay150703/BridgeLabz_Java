package CoreProgramming.Methods.Level3;

public class StudentScorecard {

    public static int[][] generatePCM(int n) {
        int[][] m = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = 10 + (int)(Math.random()*90);
        return m;
    }

    public static double[][] calculate(int[][] m) {
        double[][] r = new double[m.length][3];
        for (int i = 0; i < m.length; i++) {
            int total = m[i][0]+m[i][1]+m[i][2];
            r[i][0] = total;
            r[i][1] = Math.round((total/3.0)*100)/100.0;
            r[i][2] = Math.round((total/300.0*100)*100)/100.0;
        }
        return r;
    }
}
