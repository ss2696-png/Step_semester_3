package abstraction_interface.assigment_problems;

// TV rated at 100 W without saver mode.
public class Television extends Appliance {
    private static final double POWER_WATTS = 100;

    public Television(double hours) {
        super(hours);
    }

    @Override
    public String getName() {
        return "TV";
    }

    @Override
    protected double powerWatts() {
        return POWER_WATTS;
    }
}
