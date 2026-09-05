package arrays.assigment_problems;

import java.util.Arrays;

// Runs the 3Sum examples including a heavy-duplicate input.
public class A3_ThreeSumDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(ThreeSum.threeSum(new int[] {-1, 0, 1, 2, -1, -4})));
        System.out.println(Arrays.deepToString(ThreeSum.threeSum(new int[] {0, 0, 0})));
        System.out.println(Arrays.deepToString(ThreeSum.threeSum(new int[] {-2, 0, 0, 2, 2, -2, 0})));
    }
}
