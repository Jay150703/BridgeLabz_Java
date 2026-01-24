package dsa.sorting;

/*
 * Bubble Sort to sort student marks in ascending order.
 * Repeatedly compares adjacent elements and swaps them if they are in wrong order.
 * Best Case Time Complexity: O(n)
 * Worst/Average Case: O(n^2)
 */

public class BubbleSortStudentMarks {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // optimization to stop early

            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 62, 88};
        bubbleSort(marks);

        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
