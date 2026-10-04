package abstraction_interface.class_problems;

// Flight ticket charged a base fare of 2500 plus 4 per km.
public class FlightBooking extends TravelBooking {
    private static final double BASE_FARE = 2500;
    private static final double RATE_PER_KM = 4;

    public FlightBooking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public String getMode() {
        return "FLIGHT";
    }

    @Override
    protected double fare() {
        return BASE_FARE + getDistanceKm() * RATE_PER_KM;
    }
}
