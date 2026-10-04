package abstraction_interface.class_problems;

// Factory connection billed 6 per unit with a minimum bill of 1000.
public class FactoryConnection extends ElectricConnection {
    private static final double RATE = 6;
    private static final double MINIMUM_BILL = 1000;

    public FactoryConnection(double units) {
        super(units);
    }

    @Override
    public String getType() {
        return "FACTORY";
    }

    @Override
    public double bill() {
        return Math.max(getUnits() * RATE, MINIMUM_BILL);
    }
}
