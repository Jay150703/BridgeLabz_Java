package dsa.analysis;

/*
 * Compares Recursive and Iterative Fibonacci approaches
 * to demonstrate exponential vs linear time complexity.
 */

public class RecursiveVsIterativeFibonacci {

    private static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    private static int fibonacciIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long start = System.nanoTime();
        fibonacciRecursive(n);
        long recursiveTime = System.nanoTime() - start;

        start = System.nanoTime();
        fibonacciIterative(n);
        long iterativeTime = System.nanoTime() - start;

        System.out.println("Recursive Time (ns): " + recursiveTime);
        System.out.println("Iterative Time (ns): " + iterativeTime);
    }
}
