package abstraction_interface.class_problems;

// Train ticket charged 1.5 per km.
public class TrainBooking extends TravelBooking {
    private static final double RATE_PER_KM = 1.5;

    public TrainBooking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public String getMode() {
        return "TRAIN";
    }

    @Override
    protected double fare() {
        return getDistanceKm() * RATE_PER_KM;
    }
}
