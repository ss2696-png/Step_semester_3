package data_structures.assigment_problems;

// Runs the busiest bus row sample.
public class A5_BusiestBusRowDemo {
    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };
        int[] result = BusiestBusRow.busiestRow(grid);
        System.out.println("Row " + result[0] + ", Total " + result[1]);
    }
}
