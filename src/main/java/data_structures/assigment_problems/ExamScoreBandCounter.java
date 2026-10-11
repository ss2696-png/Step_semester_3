package data_structures.assigment_problems;

// Counts sorted exam scores inside an inclusive band using two boundary binary searches.
public class ExamScoreBandCounter {

    public static int countInBand(int[] scores, int low, int high) {
        if (scores == null) {
            throw new IllegalArgumentException("Scores must not be null");
        }
        if (low > high) {
            return 0;
        }
        return firstIndexAbove(scores, high) - firstIndexAtLeast(scores, low);
    }

    private static int firstIndexAtLeast(int[] scores, int target) {
        int left = 0;
        int right = scores.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private static int firstIndexAbove(int[] scores, int target) {
        int left = 0;
        int right = scores.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
