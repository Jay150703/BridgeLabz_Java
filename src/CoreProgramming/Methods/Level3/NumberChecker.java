package CoreProgramming.Methods.Level3;

public class NumberChecker {

    public static int countDigits(int n) {
        int c = 0;
        while (n != 0) { c++; n /= 10; }
        return c;
    }

    public static int[] getDigits(int n) {
        int[] d = new int[countDigits(n)];
        int i = 0;
        while (n != 0) {
            d[i++] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == n;
    }

    public static int[] largestSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) { sec = max; max = d; }
            else if (d > sec && d != max) sec = d;
        }
        return new int[]{max, sec};
    }

    public static int[] smallestSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, sec = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) { sec = min; min = d; }
            else if (d < sec && d != min) sec = d;
        }
        return new int[]{min, sec};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);

        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(number, digits));
    }
}
