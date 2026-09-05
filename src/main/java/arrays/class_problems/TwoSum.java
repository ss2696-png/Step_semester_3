package arrays.class_problems;

// Finds the two shelf prices that add up to a customer's budget using a pairwise scan.
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("Prices array cannot be null");
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}
