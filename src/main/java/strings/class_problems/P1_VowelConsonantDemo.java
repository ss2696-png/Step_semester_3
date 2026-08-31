package strings.class_problems;

// Prints vowel and consonant counts for sample titles.
public class P1_VowelConsonantDemo {

    public static void main(String[] args) {
        VowelConsonantCounter counter = new VowelConsonantCounter();
        counter.countVowelsAndConsonants("Java Programming");
        counter.countVowelsAndConsonants("The Alchemist");
    }
}
