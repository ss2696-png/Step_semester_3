package abstraction_interface.class_problems;

// Magazine charged 1 per day late.
public class Magazine extends LibraryItem {
    private static final double FINE_PER_DAY = 1;

    public Magazine(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double fine() {
        return getDaysLate() * FINE_PER_DAY;
    }
}
