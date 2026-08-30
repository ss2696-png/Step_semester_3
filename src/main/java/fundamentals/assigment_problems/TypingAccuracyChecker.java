package fundamentals.assigment_problems;

// Compares a typed attempt with the original passage character by character.
public class TypingAccuracyChecker {

    public void checkTypingAccuracy(String original, String typed) {
        if (original.length() != typed.length()) {
            throw new IllegalArgumentException("Original and typed text must have the same length");
        }
        int matched = 0;
        int firstMismatch = -1;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }
        double accuracy = original.isEmpty() ? 100.0 : matched * 100.0 / original.length();
        String result = String.format("Matched: %d/%d | Accuracy: %.2f%% | ", matched, original.length(), accuracy);
        if (firstMismatch == -1) {
            result += "No Mismatches";
        } else {
            result += "First Mismatch at position " + (firstMismatch + 1)
                    + " ('" + original.charAt(firstMismatch) + "' vs '" + typed.charAt(firstMismatch) + "')";
        }
        System.out.println(result);
    }
}
