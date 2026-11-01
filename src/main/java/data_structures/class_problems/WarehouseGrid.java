package data_structures.class_problems;

// Scans a warehouse bin grid once to get the total items and the first fullest bin.
public class WarehouseGrid {

    private long total;
    private int maxRow;
    private int maxCol;

    public void warehouseSummary(int[][] grid) {
        if (grid == null || grid.length == 0) {
            throw new IllegalArgumentException("Grid cannot be empty");
        }
        total = 0;
        maxRow = -1;
        maxCol = -1;
        int maxValue = Integer.MIN_VALUE;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                total += grid[r][c];
                if (grid[r][c] > maxValue) {
                    maxValue = grid[r][c];
                    maxRow = r;
                    maxCol = c;
                }
            }
        }
    }

    public long getTotal() {
        return total;
    }

    public String getMaxCoordinate() {
        return "(" + maxRow + ", " + maxCol + ")";
    }
}
