package arrays_methods.assigment_problems;

// Finds the weekly minimum, maximum and spread of fantasy scores in one pass.
public class TopPerformerTracker {

    public static String findMinMaxSpread(int[] scores) {
        if (scores == null || scores.length < 2) {
            throw new IllegalArgumentException("Need at least 2 scores");
        }
        int min = scores[0];
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return "Min: " + min + " | Max: " + max + " | Spread: " + (max - min);
    }
}
