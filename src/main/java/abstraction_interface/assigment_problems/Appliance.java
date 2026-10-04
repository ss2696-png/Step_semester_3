package abstraction_interface.assigment_problems;

// Home appliance whose monthly units come from its power rating and hours used.
public abstract class Appliance {
    public static final double COST_PER_UNIT = 8;

    private final double hours;

    protected Appliance(double hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        this.hours = hours;
    }

    public abstract String getName();

    protected abstract double powerWatts();

    public double units() {
        return powerWatts() * hours / 1000;
    }

    public static double cost(double units) {
        return units * COST_PER_UNIT;
    }
}
