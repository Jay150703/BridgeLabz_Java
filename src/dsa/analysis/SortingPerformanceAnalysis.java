package dsa.analysis;

import java.util.Arrays;

/*
 * Compares Bubble Sort, Merge Sort, and Quick Sort
 * for runtime performance on moderate-sized data.
 */

public class SortingPerformanceAnalysis {

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int size = 2000;
        int[] original = new int[size];

        for (int i = 0; i < size; i++) {
            original[i] = size - i;
        }

        int[] bubble = original.clone();
        int[] merge = original.clone();
        int[] quick = original.clone();

        long start = System.nanoTime();
        bubbleSort(bubble);
        long bubbleTime = System.nanoTime() - start;

        start = System.nanoTime();
        Arrays.sort(merge); // Merge/TimSort
        long mergeTime = System.nanoTime() - start;

        start = System.nanoTime();
        Arrays.sort(quick); // Quick/TimSort
        long quickTime = System.nanoTime() - start;

        System.out.println("Bubble Sort Time (ns): " + bubbleTime);
        System.out.println("Merge Sort Time (ns): " + mergeTime);
        System.out.println("Quick Sort Time (ns): " + quickTime);
    }
}
