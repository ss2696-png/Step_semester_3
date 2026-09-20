package encapsulation.class_problems;

// Records right or wrong answers privately and only reveals the final score.
public class Scorecard {
    private final boolean[] results;
    private int recorded;

    public Scorecard(int totalQuestions) {
        if (totalQuestions <= 0) {
            throw new IllegalArgumentException("Question count must be positive");
        }
        results = new boolean[totalQuestions];
    }

    public boolean recordAnswer(boolean correct) {
        if (recorded == results.length) {
            return false;
        }
        results[recorded++] = correct;
        return true;
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < recorded; i++) {
            if (results[i]) {
                score++;
            }
        }
        return score;
    }

    public int getTotalQuestions() {
        return results.length;
    }
}
