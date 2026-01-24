package dsa.searching.binary;

/*
 * Finds first and last occurrence of a target in a sorted array.
 */

public class FirstAndLastOccurrence {

    private static int findIndex(int[] arr, int target, boolean first) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (first) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};

        System.out.println(findIndex(arr, 2, true));
        System.out.println(findIndex(arr, 2, false));
    }
}
