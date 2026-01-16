package CoreProgramming.Methods.Level3;

public class CollinearCheck {

    public static boolean bySlope(int x1,int y1,int x2,int y2,int x3,int y3) {
        return (y2-y1)*(x3-x2) == (y3-y2)*(x2-x1);
    }

    public static boolean byArea(int x1,int y1,int x2,int y2,int x3,int y3) {
        double area = 0.5 * (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area == 0;
    }
}
