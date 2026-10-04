package abstraction_interface.class_problems;

// Travel booking that adds the shared booking fee on top of the mode-specific fare.
public abstract class TravelBooking {
    public static final double BOOKING_FEE = 50;

    private final double distanceKm;

    protected TravelBooking(double distanceKm) {
        if (distanceKm <= 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }
        this.distanceKm = distanceKm;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public abstract String getMode();

    protected abstract double fare();

    public final double total() {
        return fare() + BOOKING_FEE;
    }
}
