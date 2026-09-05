package arrays.assigment_problems;

import java.util.HashMap;
import java.util.Map;

// Counts contiguous stretches of attendance changes that sum to exactly k using prefix sums.
public class SubarraySumCounter {
    public static int subarraySum(int[] nums, int k) {
        if (nums == null) {
            return 0;
        }
        Map<Integer, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0, 1);
        int runningSum = 0;
        int count = 0;
        for (int num : nums) {
            runningSum += num;
            count += prefixCounts.getOrDefault(runningSum - k, 0);
            prefixCounts.merge(runningSum, 1, Integer::sum);
        }
        return count;
    }
}
