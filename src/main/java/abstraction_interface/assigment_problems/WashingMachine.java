package abstraction_interface.assigment_problems;

// Washing machine rated at 500 W with saver mode support.
public class WashingMachine extends Appliance implements SaverMode {
    private static final double POWER_WATTS = 500;

    public WashingMachine(double hours) {
        super(hours);
    }

    @Override
    public String getName() {
        return "WASHER";
    }

    @Override
    protected double powerWatts() {
        return POWER_WATTS;
    }
}
