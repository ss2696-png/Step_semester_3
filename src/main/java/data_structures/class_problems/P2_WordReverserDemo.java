package data_structures.class_problems;

// Reverses sample words and reports whether each is a palindrome.
public class P2_WordReverserDemo {
    public static void main(String[] args) {
        String[] words = {"level", "java"};
        for (String word : words) {
            System.out.println(WordReverser.describe(word));
        }
    }
}
