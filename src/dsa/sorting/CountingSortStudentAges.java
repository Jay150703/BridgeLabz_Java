package dsa.sorting;

/*
 * Counting Sort for sorting student ages (10–18).
 * Best suited for small range integers.
 * Time Complexity: O(n + k)
 */

public class CountingSortStudentAges {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int[] count = new int[maxAge - minAge + 1];

        // count frequency
        for (int age : ages) {
            count[age - minAge]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i + minAge;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {14, 12, 16, 10, 18, 13, 15};
        countingSort(ages);

        for (int a : ages) {
            System.out.print(a + " ");
        }
    }
}
