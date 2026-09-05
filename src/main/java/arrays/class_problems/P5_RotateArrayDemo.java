package arrays.class_problems;

import java.util.Arrays;

// Runs the Rotate Array examples.
public class P5_RotateArrayDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayRotator.rotateArray(new int[] {1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(ArrayRotator.rotateArray(new int[] {1, 2}, 3)));
    }
}
