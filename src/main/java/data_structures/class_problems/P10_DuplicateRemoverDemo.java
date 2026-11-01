package data_structures.class_problems;

import java.util.Arrays;

public class P10_DuplicateRemoverDemo {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int length = DuplicateRemover.removeDuplicates(nums);
        System.out.println("length = " + length);
        System.out.println("nums[0.." + (length - 1) + "] = " + Arrays.toString(DuplicateRemover.uniquePart(nums, length)));
        System.out.println("Extra space: O(1), only two index variables are used");
    }
}
