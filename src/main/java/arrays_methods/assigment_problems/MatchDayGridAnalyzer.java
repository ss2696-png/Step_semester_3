package arrays_methods.assigment_problems;

// Flags Power Surge cricket matches from a runs-per-over grid using a reusable row-average helper.
public class MatchDayGridAnalyzer {

    private static double rowAverage(int[] row) {
        if (row == null || row.length == 0) {
            return 0;
        }
        int totalRuns = 0;
        for (int runs : row) {
            totalRuns += runs;
        }
        return (double) totalRuns / row.length;
    }

    public static String classifyMatches(int[][] runsPerOver, int threshold) {
        if (runsPerOver == null) {
            throw new IllegalArgumentException("Runs grid cannot be null");
        }
        StringBuilder report = new StringBuilder();
        for (int match = 0; match < runsPerOver.length; match++) {
            String label = rowAverage(runsPerOver[match]) >= threshold ? "Power Surge" : "Normal";
            if (match > 0) {
                report.append(" | ");
            }
            report.append("Match ").append(match).append(": ").append(label);
        }
        return report.toString();
    }
}
