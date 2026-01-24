package dsa.searching.linear;

/*
 * Linear Search to find the first negative number in an array.
 * Returns the index of the first negative element.
 */

public class FirstNegativeNumber {

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // return immediately when found
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, -7, 9};
        System.out.println(findFirstNegative(arr));
    }
}
