package abstraction_interface.class_problems;

// Book charged 2 per day late.
public class Book extends LibraryItem {
    private static final double FINE_PER_DAY = 2;

    public Book(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double fine() {
        return getDaysLate() * FINE_PER_DAY;
    }
}
