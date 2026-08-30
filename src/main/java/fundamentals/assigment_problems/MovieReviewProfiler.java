package fundamentals.assigment_problems;

// Counts short, medium and long words in a movie review.
public class MovieReviewProfiler {

    public void classifyWordLengths(String review) {
        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;
        for (String word : review.trim().split("\\s+")) {
            int length = word.length();
            if (length == 0) {
                continue;
            }
            if (length <= 4) {
                shortWords++;
            } else if (length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }
        System.out.println("Short: " + shortWords + " | Medium: " + mediumWords + " | Long: " + longWords);
    }
}
