package arrays.class_problems;

// Rotates a playlist to the right by placing each song at its calculated position.
public class ArrayRotator {
    public static int[] rotateArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        if (k < 0) {
            throw new IllegalArgumentException("Rotation count cannot be negative");
        }
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }
        return rotated;
    }
}
