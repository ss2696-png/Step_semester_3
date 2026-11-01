package data_structures.class_problems;

public class P8_SpiralTraversalDemo {
    public static void main(String[] args) {
        int[][] square = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] wide = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        System.out.println(SpiralTraversal.spiralOrder(square));
        System.out.println(SpiralTraversal.spiralOrder(wide));
        System.out.println("Time: O(m * n), Output space: O(m * n)");
    }
}
