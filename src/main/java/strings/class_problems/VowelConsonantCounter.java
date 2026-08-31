package strings.class_problems;

// Counts vowels and consonants in a book title for the library kiosk.
public class VowelConsonantCounter {

    private static final String VOWELS = "aeiou";

    public int[] count(String text) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch < 'a' || ch > 'z') {
                continue;
            }
            if (VOWELS.indexOf(ch) >= 0) {
                vowels++;
            } else {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public void countVowelsAndConsonants(String text) {
        int[] result = count(text);
        System.out.println("\"" + text + "\" -> Vowels: " + result[0] + " | Consonants: " + result[1]);
    }
}
