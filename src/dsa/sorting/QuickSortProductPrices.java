package dsa.sorting;

/*
 * Quick Sort to sort product prices.
 * Uses partitioning around a pivot.
 * Average Time Complexity: O(n log n)
 */

public class QuickSortProductPrices {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {1200, 450, 800, 300, 1500};
        quickSort(prices, 0, prices.length - 1);

        for (int p : prices) {
            System.out.print(p + " ");
        }
    }
}
