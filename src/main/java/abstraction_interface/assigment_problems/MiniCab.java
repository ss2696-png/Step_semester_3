package abstraction_interface.assigment_problems;

// Mini cab charging 10 per km; no night service.
public class MiniCab extends Cab {
    private static final double RATE = 10;

    public MiniCab(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public String getType() {
        return "MINI";
    }

    @Override
    protected double ratePerKm() {
        return RATE;
    }
}
