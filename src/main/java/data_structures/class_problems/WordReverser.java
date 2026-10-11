package data_structures.class_problems;

// Reverses a word with StringBuilder and checks whether it is a palindrome.
public class WordReverser {

    public static String reverse(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Word must not be null");
        }
        return new StringBuilder(word).reverse().toString();
    }

    public static boolean isPalindrome(String word) {
        return word.equals(reverse(word));
    }

    public static String describe(String word) {
        String reversed = reverse(word);
        return reversed + (isPalindrome(word) ? " - palindrome" : " - not a palindrome");
    }
}
