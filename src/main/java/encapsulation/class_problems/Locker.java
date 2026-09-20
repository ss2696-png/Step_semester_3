package encapsulation.class_problems;

// Gym locker whose combination can be changed but never read from outside.
public class Locker {
    private final int lockerNumber;
    private String code;

    public Locker(int lockerNumber, String code) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Code cannot be blank");
        }
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (!code.equals(currentCode) || newCode == null || newCode.isBlank()) {
            return false;
        }
        code = newCode;
        return true;
    }

    public boolean unlock(String attempt) {
        return code.equals(attempt);
    }

    public int getLockerNumber() {
        return lockerNumber;
    }
}
