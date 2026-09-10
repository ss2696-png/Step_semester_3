package arrays_methods.class_problems;

// Tracks the top three hackathon scores in a single left-to-right pass without sorting.
public class PodiumFinder {

    public static int[] findTopThreeScores(int[] scores) {
        if (scores == null || scores.length < 3) {
            throw new IllegalArgumentException("Need at least 3 scores to build a podium");
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score > first) {
                third = second;
                second = first;
                first = score;
            } else if (score > second) {
                third = second;
                second = score;
            } else if (score > third) {
                third = score;
            }
        }
        return new int[] {first, second, third};
    }
}
