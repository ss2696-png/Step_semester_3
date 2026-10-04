package abstraction_interface.assigment_problems;

// SUV cab charging 18 per km with night service.
public class SuvCab extends Cab implements NightService {
    private static final double RATE = 18;

    public SuvCab(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public String getType() {
        return "SUV";
    }

    @Override
    protected double ratePerKm() {
        return RATE;
    }
}
