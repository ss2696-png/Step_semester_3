package strings.assigment_problems;

// Runs the PIN length check on sample PINs.
public class A1_PinLengthDemo {

    public static void main(String[] args) {
        PinLengthValidator validator = new PinLengthValidator();
        validator.checkPinLength("482");
        validator.checkPinLength("4820");
    }
}
