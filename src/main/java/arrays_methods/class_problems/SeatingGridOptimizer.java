package arrays_methods.class_problems;

// Classifies each hackathon seating row as quiet or buzzing using a reusable row-average helper.
public class SeatingGridOptimizer {

    private static double rowAverage(int[] row) {
        if (row == null || row.length == 0) {
            return 0;
        }
        int total = 0;
        for (int score : row) {
            total += score;
        }
        return (double) total / row.length;
    }

    public static String classifyRows(int[][] seatingScores, int threshold) {
        if (seatingScores == null) {
            throw new IllegalArgumentException("Seating grid cannot be null");
        }
        StringBuilder report = new StringBuilder();
        for (int i = 0; i < seatingScores.length; i++) {
            String zone = rowAverage(seatingScores[i]) < threshold ? "Quiet Zone" : "Buzzing Zone";
            if (i > 0) {
                report.append(" | ");
            }
            report.append("Row ").append(i).append(": ").append(zone);
        }
        return report.toString();
    }
}
