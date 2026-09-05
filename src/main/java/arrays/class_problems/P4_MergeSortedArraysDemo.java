package arrays.class_problems;

import java.util.Arrays;

// Runs the Merge Two Sorted Arrays examples.
public class P4_MergeSortedArraysDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortedArrayMerger.mergeSortedArrays(new int[] {1, 3, 5}, new int[] {2, 4, 6})));
        System.out.println(Arrays.toString(SortedArrayMerger.mergeSortedArrays(new int[] {}, new int[] {1, 2, 3})));
    }
}
