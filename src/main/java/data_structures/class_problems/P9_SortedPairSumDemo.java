package data_structures.class_problems;

public class P9_SortedPairSumDemo {
    public static void main(String[] args) {
        System.out.println(SortedPairSum.pairSumSorted(new int[]{-4, -1, 0, 3, 5, 9}, 4));
        System.out.println(SortedPairSum.pairSumSorted(new int[]{1, 2, 3}, 100));
        System.out.println("Two pointers: O(n) time, O(1) space vs O(n^2) checking every pair");
    }
}
