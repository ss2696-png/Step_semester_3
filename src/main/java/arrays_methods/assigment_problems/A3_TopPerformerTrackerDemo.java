package arrays_methods.assigment_problems;

// Prints the weekly recap numbers for the sample scoreboard.
public class A3_TopPerformerTrackerDemo {

    public static void main(String[] args) {
        System.out.println(TopPerformerTracker.findMinMaxSpread(new int[] {45, 82, 79, 90, 33, 90, 61}));
        System.out.println(TopPerformerTracker.findMinMaxSpread(new int[] {-5, 12}));
    }
}
