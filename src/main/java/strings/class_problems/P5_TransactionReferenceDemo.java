package strings.class_problems;

// Normalizes and checks sample transaction references.
public class P5_TransactionReferenceDemo {

    public static void main(String[] args) {
        TransactionReferenceValidator validator = new TransactionReferenceValidator();
        String[] inputs = {"  hdf03022600042  ", "12F03022600042", "ICI0302260004", "SBI0302A600042"};
        for (String input : inputs) {
            String normalized = validator.normalizeReference(input);
            System.out.println("\"" + input + "\" -> " + validator.validateAndFormat(normalized));
        }
    }
}
