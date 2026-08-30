package fundamentals.class_problems;

// Finds the first character that appears exactly once in a piece of text.
public class FirstNonRepeatingChar {

    public static final char NONE = '\0';

    public char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return NONE;
    }

    public void printResult(String text) {
        char result = findFirstNonRepeatingChar(text);
        if (result == NONE) {
            System.out.println("\"" + text + "\" -> No Non-Repeating Character Found");
        } else {
            System.out.println("\"" + text + "\" -> First Non-Repeating Character: '" + result + "'");
        }
    }
}
