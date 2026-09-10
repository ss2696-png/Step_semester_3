package arrays_methods.class_problems;

// Applies a flat hackathon bonus to every team score directly in the caller's array.
public class ScoreCurveBooster {

    public static void curveScores(int[] scores, int bonus) {
        if (scores == null) {
            throw new IllegalArgumentException("Scores array cannot be null");
        }
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative");
        }
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }
}
