package dsa.searching.binary;

/*
 * Binary Search to find any peak element in an array.
 */

public class PeakElement {

    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1};
        System.out.println(findPeak(arr));
    }
}
