package data_structures.assigment_problems;

// Single pass check for the first token that is smaller than the one before it.
public class QueueOrderChecker {

    public static int firstBreak(int[] tokens) {
        if (tokens == null) {
            return -1;
        }
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }
        return -1;
    }
}
