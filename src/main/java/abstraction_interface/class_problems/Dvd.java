package abstraction_interface.class_problems;

// DVD charged 5 per day late, capped at 50.
public class Dvd extends LibraryItem {
    private static final double FINE_PER_DAY = 5;
    private static final double MAX_FINE = 50;

    public Dvd(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double fine() {
        return Math.min(getDaysLate() * FINE_PER_DAY, MAX_FINE);
    }
}
