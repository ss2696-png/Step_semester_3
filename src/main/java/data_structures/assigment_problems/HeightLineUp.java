package data_structures.assigment_problems;

import java.util.Arrays;

// Bubble sort for the class photo line that prints the line after every sweep and stops early.
public class HeightLineUp {

    public static void lineUp(int[] heights) {
        int n = heights.length;
        for (int pass = 1; pass < n || pass == 1; pass++) {
            boolean swapped = false;
            for (int j = 0; j < n - pass; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
            if (!swapped) {
                break;
            }
        }
    }
}
