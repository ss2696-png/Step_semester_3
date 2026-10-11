package data_structures.class_problems;

// Reverses an array of token numbers in place using two pointers.
public class ArrayReverser {

    public static void reverseInPlace(int[] tokens) {
        if (tokens == null) {
            throw new IllegalArgumentException("Tokens must not be null");
        }
        int left = 0;
        int right = tokens.length - 1;
        while (left < right) {
            int temp = tokens[left];
            tokens[left] = tokens[right];
            tokens[right] = temp;
            left++;
            right--;
        }
    }
}
