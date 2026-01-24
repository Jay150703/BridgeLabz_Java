package dsa.analysis;

import java.util.*;

/*
 * Compares search performance of Array, HashSet, and TreeSet.
 */

public class DataStructureSearchComparison {

    public static void main(String[] args) {
        int size = 100_000;
        int target = size - 1;

        int[] array = new int[size];
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start = System.nanoTime();
        for (int i : array) {
            if (i == target) break;
        }
        long arrayTime = System.nanoTime() - start;

        start = System.nanoTime();
        hashSet.contains(target);
        long hashSetTime = System.nanoTime() - start;

        start = System.nanoTime();
        treeSet.contains(target);
        long treeSetTime = System.nanoTime() - start;

        System.out.println("Array Search Time (ns): " + arrayTime);
        System.out.println("HashSet Search Time (ns): " + hashSetTime);
        System.out.println("TreeSet Search Time (ns): " + treeSetTime);
    }
}
