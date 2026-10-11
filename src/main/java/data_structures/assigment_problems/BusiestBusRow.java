package data_structures.assigment_problems;

// Finds the bus seat row with the largest total, keeping the earlier row on ties.
public class BusiestBusRow {

    public static int[] busiestRow(int[][] grid) {
        if (grid == null || grid.length == 0) {
            throw new IllegalArgumentException("Grid must not be empty");
        }
        int bestRow = -1;
        int bestTotal = -1;
        for (int row = 0; row < grid.length; row++) {
            int total = 0;
            for (int seat : grid[row]) {
                total += seat;
            }
            if (total > bestTotal) {
                bestTotal = total;
                bestRow = row;
            }
        }
        return new int[] {bestRow, bestTotal};
    }
}
