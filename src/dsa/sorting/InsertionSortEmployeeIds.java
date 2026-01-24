package dsa.sorting;

/*
 * Insertion Sort to arrange employee IDs in ascending order.
 * Builds a sorted portion of the array one element at a time.
 * Time Complexity: O(n^2)
 */

public class InsertionSortEmployeeIds {

    public static void insertionSort(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {104, 102, 109, 101, 105};
        insertionSort(ids);

        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}
