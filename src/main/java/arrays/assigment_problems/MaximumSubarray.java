package arrays.assigment_problems;

// Finds the best contiguous trading stretch using Kadane's extend-or-restart rule.
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Need at least one day of figures");
        }
        int currentSum = nums[0];
        int bestSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }
}
