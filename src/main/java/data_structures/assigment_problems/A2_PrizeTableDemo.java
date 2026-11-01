package data_structures.assigment_problems;

import java.util.Arrays;

public class A2_PrizeTableDemo {
    public static void main(String[] args) {
        int[][] inputs = {{45, 90, 60, 75}, {80, 70, 60}, {10, 50, 30, 50}};
        for (int[] marks : inputs) {
            int swaps = PrizeTable.prizeTable(marks);
            System.out.println(Arrays.toString(marks) + " swaps = " + swaps);
        }
    }
}
