package encapsulation.assigment_problems;

// Rates the sample passwords from the assignment sheet.
public class A3_PasswordCheckerDemo {
    public static void main(String[] args) {
        String[] samples = {"abcd", "abcdefgh", "abcdefghij", "secure2026pw"};
        for (String sample : samples) {
            PasswordChecker pc = new PasswordChecker(sample);
            System.out.println(sample.length() + " characters -> " + pc.getStrength()
                    + (pc.hasDigit() ? " (has a digit)" : ""));
        }
    }
}
