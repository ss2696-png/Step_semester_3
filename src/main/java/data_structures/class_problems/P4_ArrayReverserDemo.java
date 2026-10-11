package data_structures.class_problems;

import java.util.Arrays;

// Reverses the sample token list in place and prints it.
public class P4_ArrayReverserDemo {
    public static void main(String[] args) {
        int[] tokens = {11, 22, 33, 44};
        ArrayReverser.reverseInPlace(tokens);
        System.out.println(Arrays.toString(tokens));
    }
}
