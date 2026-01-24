package dsa.analysis;

/*
 * Demonstrates best practices related to Runtime Analysis and Big-O notation.
 * This class does not benchmark but documents good algorithmic decisions
 * through simple examples.
 */

public class BigONotationBestPractices {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i; // early return optimization
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoids overflow
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }

        System.out.println("Linear Search Index: " + linearSearch(data, 900));
        System.out.println("Binary Search Index: " + binarySearch(data, 900));
    }
}
