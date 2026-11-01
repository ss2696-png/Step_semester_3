package data_structures.class_problems;

public class P5_PairSumFinderDemo {
    public static void main(String[] args) {
        int[] first = {2, 7, 11, 15};
        int[] second = {3, 4, 6};
        System.out.println(PairSumFinder.hasPairWithSum(first, 9) + " (2 + 7 = 9)");
        System.out.println(PairSumFinder.hasPairWithSum(second, 20));
        System.out.println("Brute force: " + PairSumFinder.hasPairBruteForce(first, 9) + " - O(n^2) time, O(1) space");
        System.out.println("HashSet: O(n) time, O(n) space");
        System.out.println("Sort + two pointers: " + PairSumFinder.hasPairBySorting(first, 9) + " - O(n log n) time");
    }
}
