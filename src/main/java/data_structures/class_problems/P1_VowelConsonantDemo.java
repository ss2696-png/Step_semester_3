package data_structures.class_problems;

// Prints vowel and consonant counts for the sample word.
public class P1_VowelConsonantDemo {
    public static void main(String[] args) {
        int[] result = VowelConsonantCounter.count("Programming");
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
