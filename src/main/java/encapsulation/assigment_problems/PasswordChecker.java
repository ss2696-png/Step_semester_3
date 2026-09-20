package encapsulation.assigment_problems;

// Rates a signup password's strength without ever exposing the password.
public class PasswordChecker {
    private final String password;

    public PasswordChecker(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        this.password = password;
    }

    public String getStrength() {
        int length = password.length();
        if (length < 6) {
            return "Weak";
        }
        if (length < 10) {
            return "Medium";
        }
        return "Strong";
    }

    public boolean hasDigit() {
        for (char ch : password.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return false;
    }
}
