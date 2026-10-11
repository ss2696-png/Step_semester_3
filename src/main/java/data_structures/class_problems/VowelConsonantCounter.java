package data_structures.class_problems;

// Counts vowels and consonants in a single alphabetic word, ignoring case.
public class VowelConsonantCounter {
    private static final String VOWELS = "aeiou";

    public static int[] count(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word must not be empty");
        }
        int vowels = 0;
        int consonants = 0;
        for (char ch : word.toLowerCase().toCharArray()) {
            if (!Character.isLetter(ch)) {
                continue;
            }
            if (VOWELS.indexOf(ch) >= 0) {
                vowels++;
            } else {
                consonants++;
            }
        }
        return new int[] {vowels, consonants};
    }
}
