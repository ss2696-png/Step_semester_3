package strings.assigment_problems;

// Reverses every word of a sentence while keeping the word order.
public class WordReversalEncoder {

    public String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int w = 0; w < words.length; w++) {
            StringBuilder reversed = new StringBuilder();
            for (int i = words[w].length() - 1; i >= 0; i--) {
                reversed.append(words[w].charAt(i));
            }
            if (w > 0) {
                result.append(' ');
            }
            result.append(reversed);
        }
        return result.toString();
    }
}
