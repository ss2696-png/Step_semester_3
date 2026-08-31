package strings.assigment_problems;

// Normalizes and validates library intake codes before cataloguing.
public class IsbnNormalizer {

    private static final int CODE_LENGTH = 13;
    private static final int PUBLISHER_LENGTH = 3;

    public String normalizeCode(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < PUBLISHER_LENGTH) {
            return trimmed.toUpperCase();
        }
        return trimmed.substring(0, PUBLISHER_LENGTH).toUpperCase() + trimmed.substring(PUBLISHER_LENGTH);
    }

    public String validateAndFormat(String code) {
        if (code.length() != CODE_LENGTH) {
            return "Invalid: code must be exactly 13 characters";
        }
        for (int i = 0; i < PUBLISHER_LENGTH; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }
        for (int i = PUBLISHER_LENGTH; i < CODE_LENGTH; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: year and catalog must be digits";
            }
        }
        StringBuilder display = new StringBuilder();
        display.append('[').append(code, 0, 3).append("] YEAR: ")
                .append(code, 3, 7)
                .append(" | CATALOG: ").append(code.substring(7));
        return display.toString();
    }
}
