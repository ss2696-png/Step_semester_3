package polymorphism.class_problems;

import java.time.LocalDate;

// Base library item; subclasses set how many days it can be borrowed.
public abstract class LibraryItem {
    private final String title;

    protected LibraryItem(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    protected abstract int borrowDays();

    public LocalDate dueDate(LocalDate borrowedOn) {
        return borrowedOn.plusDays(borrowDays());
    }
}
