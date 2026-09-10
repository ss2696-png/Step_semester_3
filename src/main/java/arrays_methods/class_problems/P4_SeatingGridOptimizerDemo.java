package arrays_methods.class_problems;

// Classifies the sample seating grid and a jagged grid with uneven row lengths.
public class P4_SeatingGridOptimizerDemo {

    public static void main(String[] args) {
        int[][] grid = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };
        System.out.println(SeatingGridOptimizer.classifyRows(grid, 60));

        int[][] jagged = {
            {60},
            {70, 50, 40, 90},
            {59, 61}
        };
        System.out.println(SeatingGridOptimizer.classifyRows(jagged, 60));
    }
}
