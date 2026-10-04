package abstraction_interface.class_problems;

// Bus ticket charged 2 per km.
public class BusBooking extends TravelBooking {
    private static final double RATE_PER_KM = 2;

    public BusBooking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public String getMode() {
        return "BUS";
    }

    @Override
    protected double fare() {
        return getDistanceKm() * RATE_PER_KM;
    }
}
