package data_structures.assigment_problems;

// Finds the second-highest distinct score in a single pass without sorting.
public class SecondBestScore {

    public static int secondHighest(int[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Scores must not be empty");
        }
        int highest = -1;
        int second = -1;
        for (int score : scores) {
            if (score > highest) {
                second = highest;
                highest = score;
            } else if (score < highest && score > second) {
                second = score;
            }
        }
        return second;
    }
}
