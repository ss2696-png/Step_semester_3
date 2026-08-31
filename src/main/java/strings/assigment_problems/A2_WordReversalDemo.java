package strings.assigment_problems;

// Encodes sample sentences with mirrored words.
public class A2_WordReversalDemo {

    public static void main(String[] args) {
        WordReversalEncoder encoder = new WordReversalEncoder();
        System.out.println(encoder.reverseEachWord("hello club"));
        System.out.println(encoder.reverseEachWord("java is fun"));
    }
}
