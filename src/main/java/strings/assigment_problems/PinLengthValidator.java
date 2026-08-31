package strings.assigment_problems;

// Checks that an ATM PIN is exactly four characters long.
public class PinLengthValidator {

    private static final int PIN_LENGTH = 4;

    public void checkPinLength(String pin) {
        if (pin.length() != PIN_LENGTH) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }
}
