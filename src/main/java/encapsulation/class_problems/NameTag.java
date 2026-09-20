package encapsulation.class_problems;

// Immutable chat name tag that turns a full name into a short nickname.
public final class NameTag {
    private final String firstName;
    private final String lastName;

    public NameTag(String fullName) {
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("Full name cannot be blank");
        }
        String[] parts = fullName.trim().split(" ");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Expected a first and last name: " + fullName);
        }
        firstName = parts[0];
        lastName = parts[1];
    }

    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }
}
