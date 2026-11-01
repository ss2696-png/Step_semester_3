package data_structures.assigment_problems;

import java.util.Arrays;

public class A5_DiceTallyDemo {
    public static void main(String[] args) {
        System.out.println("Sorted: " + Arrays.toString(DiceTally.diceSort(new int[]{4, 1, 6, 4, 2, 1, 4})));
        System.out.println("Sorted: " + Arrays.toString(DiceTally.diceSort(new int[]{6, 6, 3, 5})));
    }
}
