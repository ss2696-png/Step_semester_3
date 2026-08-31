package strings.class_problems;

// Masks a phone number so only the last four digits are visible.
public class PhoneNumberMasker {

    private static final int PHONE_LENGTH = 10;

    public String maskPhoneNumber(String phone) {
        if (phone == null || phone.length() != PHONE_LENGTH) {
            return "Invalid phone number";
        }
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }
        StringBuilder masked = new StringBuilder(phone.substring(PHONE_LENGTH - 4));
        masked.insert(0, "XXXXXX-");
        return masked.toString();
    }
}
