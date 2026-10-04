package abstraction_interface.assigment_problems;

// Fridge rated at 150 W without saver mode.
public class Fridge extends Appliance {
    private static final double POWER_WATTS = 150;

    public Fridge(double hours) {
        super(hours);
    }

    @Override
    public String getName() {
        return "FRIDGE";
    }

    @Override
    protected double powerWatts() {
        return POWER_WATTS;
    }
}
