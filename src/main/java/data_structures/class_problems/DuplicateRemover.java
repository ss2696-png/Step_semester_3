package data_structures.class_problems;

import java.util.Arrays;

// Removes consecutive duplicates from a sorted array in place using a write pointer.
public class DuplicateRemover {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int write = 1;
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[write - 1]) {
                nums[write++] = nums[read];
            }
        }
        return write;
    }

    public static int[] uniquePart(int[] nums, int length) {
        return Arrays.copyOf(nums, length);
    }
}
