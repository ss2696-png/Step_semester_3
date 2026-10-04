package abstraction_interface.assigment_problems;

// Air conditioner rated at 1500 W with saver mode support.
public class AirConditioner extends Appliance implements SaverMode {
    private static final double POWER_WATTS = 1500;

    public AirConditioner(double hours) {
        super(hours);
    }

    @Override
    public String getName() {
        return "AC";
    }

    @Override
    protected double powerWatts() {
        return POWER_WATTS;
    }
}
