package dsa.analysis;

import java.util.Arrays;

/*
 * Compares Linear Search and Binary Search execution time
 * for increasing dataset sizes.
 */

public class LinearVsBinarySearchAnalysis {

    private static int linearSearch(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) return i;
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 100_000;
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = i;
        }

        int target = size - 1;

        long start = System.nanoTime();
        linearSearch(data, target);
        long linearTime = System.nanoTime() - start;

        Arrays.sort(data);

        start = System.nanoTime();
        binarySearch(data, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Linear Search Time (ns): " + linearTime);
        System.out.println("Binary Search Time (ns): " + binaryTime);
    }
}
