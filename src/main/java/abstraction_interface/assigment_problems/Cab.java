package abstraction_interface.assigment_problems;

// City cab; the minimum fare rule is shared here and each cab type sets its own rate.
public abstract class Cab {
    public static final double MINIMUM_FARE = 100;

    private final double distanceKm;

    protected Cab(double distanceKm) {
        if (distanceKm <= 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }
        this.distanceKm = distanceKm;
    }

    public abstract String getType();

    protected abstract double ratePerKm();

    public double dayFare() {
        return Math.max(distanceKm * ratePerKm(), MINIMUM_FARE);
    }
}
