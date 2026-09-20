package encapsulation.class_problems;

// Keeps today's present students private and answers only count and lookup queries.
public class AttendanceSheet {
    private final String[] present;
    private int count;

    public AttendanceSheet(int maxClassSize) {
        if (maxClassSize <= 0) {
            throw new IllegalArgumentException("Class size must be positive");
        }
        present = new String[maxClassSize];
    }

    public boolean markPresent(String name) {
        if (name == null || name.isBlank() || isPresent(name) || count == present.length) {
            return false;
        }
        present[count++] = name;
        return true;
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (present[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
}
