package arrays.assigment_problems;

import java.util.Arrays;

// Runs the Product of Array Except Self examples.
public class A1_ProductExceptSelfDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ProductExceptSelf.productExceptSelf(new int[] {1, 2, 3, 4})));
        System.out.println(Arrays.toString(ProductExceptSelf.productExceptSelf(new int[] {-1, 1, 0, -3, 3})));
    }
}
