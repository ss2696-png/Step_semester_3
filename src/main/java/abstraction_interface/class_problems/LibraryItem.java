package abstraction_interface.class_problems;

// Borrowed library item; each item type defines its own late fine rule.
public abstract class LibraryItem {
    private final String title;
    private final int daysLate;

    protected LibraryItem(String title, int daysLate) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title is required");
        }
        if (daysLate < 0) {
            throw new IllegalArgumentException("Days late cannot be negative");
        }
        this.title = title;
        this.daysLate = daysLate;
    }

    public String getTitle() {
        return title;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public abstract double fine();
}
