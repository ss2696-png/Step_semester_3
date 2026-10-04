package abstraction_interface.class_problems;

// Electricity connection holding units used; each connection type computes its own bill.
public abstract class ElectricConnection {
    private final double units;

    protected ElectricConnection(double units) {
        if (units < 0) {
            throw new IllegalArgumentException("Units cannot be negative");
        }
        this.units = units;
    }

    public double getUnits() {
        return units;
    }

    public abstract String getType();

    public abstract double bill();
}
