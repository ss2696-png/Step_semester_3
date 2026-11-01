package data_structures.class_problems;

public class P7_InsertPositionDemo {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(InsertPosition.searchInsertPosition(nums, 5));
        System.out.println(InsertPosition.searchInsertPosition(nums, 2));
        System.out.println(InsertPosition.searchInsertPosition(nums, 7));
        System.out.println("Time: O(log n)");
    }
}
