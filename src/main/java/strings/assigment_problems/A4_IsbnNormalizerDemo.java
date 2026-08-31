package strings.assigment_problems;

// Normalizes and checks sample scanned codes.
public class A4_IsbnNormalizerDemo {

    public static void main(String[] args) {
        IsbnNormalizer normalizer = new IsbnNormalizer();
        String[] inputs = {" pen2026004251 ", "12N2026004251", "OXF202600425", "har20260O4251"};
        for (String input : inputs) {
            System.out.println("\"" + input + "\" -> " + normalizer.validateAndFormat(normalizer.normalizeCode(input)));
        }
    }
}
