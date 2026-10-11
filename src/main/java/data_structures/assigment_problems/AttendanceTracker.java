package data_structures.assigment_problems;

// Finds present days and the longest unbroken attendance streak in one pass.
public class AttendanceTracker {

    public static int[] attendanceSummary(int[] days) {
        if (days == null) {
            throw new IllegalArgumentException("Days must not be null");
        }
        int present = 0;
        int current = 0;
        int longest = 0;
        for (int day : days) {
            if (day == 1) {
                present++;
                current++;
                longest = Math.max(longest, current);
            } else if (day == 0) {
                current = 0;
            } else {
                throw new IllegalArgumentException("Attendance values must be 0 or 1");
            }
        }
        return new int[] {present, longest};
    }
}
