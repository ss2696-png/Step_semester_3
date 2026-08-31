package strings.class_problems;

// Normalizes and validates bank transaction reference codes.
public class TransactionReferenceValidator {

    private static final int REFERENCE_LENGTH = 14;
    private static final int BANK_CODE_LENGTH = 3;

    public String normalizeReference(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < BANK_CODE_LENGTH) {
            return trimmed.toUpperCase();
        }
        return trimmed.substring(0, BANK_CODE_LENGTH).toUpperCase() + trimmed.substring(BANK_CODE_LENGTH);
    }

    public String validateAndFormat(String reference) {
        if (reference.length() != REFERENCE_LENGTH) {
            return "Invalid: reference must be exactly 14 characters";
        }
        for (int i = 0; i < BANK_CODE_LENGTH; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }
        for (int i = BANK_CODE_LENGTH; i < REFERENCE_LENGTH; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: date and sequence must be digits";
            }
        }
        StringBuilder display = new StringBuilder();
        display.append('[').append(reference, 0, 3).append("] DATE: ")
                .append(reference, 3, 5).append('/')
                .append(reference, 5, 7).append('/')
                .append(reference, 7, 9)
                .append(" | SEQ: ").append(reference.substring(9));
        return display.toString();
    }
}
