package data_structures.class_problems;

public class P2_WarehouseGridDemo {
    public static void main(String[] args) {
        int[][] grid = {
            {4, 9, 2},
            {7, 1, 6},
            {3, 12, 5}
        };
        WarehouseGrid warehouse = new WarehouseGrid();
        warehouse.warehouseSummary(grid);
        System.out.println("total = " + warehouse.getTotal() + ", maxCoordinate = " + warehouse.getMaxCoordinate());
        System.out.println("Time: O(m * n), Extra space: O(1)");
    }
}
