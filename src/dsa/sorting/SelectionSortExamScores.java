package dsa.sorting;

/*
 * Selection Sort for sorting exam scores.
 * Repeatedly selects the minimum element and places it at correct position.
 * Time Complexity: O(n^2)
 */

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {67, 85, 72, 90, 55};
        selectionSort(scores);

        for (int s : scores) {
            System.out.print(s + " ");
        }
    }
}
