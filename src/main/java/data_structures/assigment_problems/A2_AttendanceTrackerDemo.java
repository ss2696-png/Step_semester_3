package data_structures.assigment_problems;

// Runs the attendance tracker samples.
public class A2_AttendanceTrackerDemo {

    static void print(int[] days) {
        int[] summary = AttendanceTracker.attendanceSummary(days);
        System.out.println("Present: " + summary[0] + ", Longest streak: " + summary[1]);
    }

    public static void main(String[] args) {
        print(new int[] {1, 1, 0, 1, 1, 1, 0, 1});
        print(new int[] {0, 0, 0});
    }
}
