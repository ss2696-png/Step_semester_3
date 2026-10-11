package data_structures.assigment_problems;

// Rotates a duty roster right by k places, reducing k with modulo first.
public class DutyRosterRotation {

    public static String[] rotateRoster(String[] names, long k) {
        if (names == null || names.length == 0) {
            throw new IllegalArgumentException("Roster must not be empty");
        }
        if (k < 0) {
            throw new IllegalArgumentException("k cannot be negative");
        }
        int n = names.length;
        int shift = (int) (k % n);
        String[] rotated = new String[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + shift) % n] = names[i];
        }
        return rotated;
    }
}
