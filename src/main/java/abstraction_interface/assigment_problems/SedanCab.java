package abstraction_interface.assigment_problems;

// Sedan cab charging 14 per km with night service.
public class SedanCab extends Cab implements NightService {
    private static final double RATE = 14;

    public SedanCab(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public String getType() {
        return "SEDAN";
    }

    @Override
    protected double ratePerKm() {
        return RATE;
    }
}
