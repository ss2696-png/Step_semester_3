package abstraction_interface.class_problems;

// Home connection billed 5 per unit up to 100 units and 7 per unit after that.
public class HomeConnection extends ElectricConnection {
    private static final double SLAB_LIMIT = 100;
    private static final double FIRST_SLAB_RATE = 5;
    private static final double SECOND_SLAB_RATE = 7;

    public HomeConnection(double units) {
        super(units);
    }

    @Override
    public String getType() {
        return "HOME";
    }

    @Override
    public double bill() {
        double units = getUnits();
        if (units <= SLAB_LIMIT) {
            return units * FIRST_SLAB_RATE;
        }
        return SLAB_LIMIT * FIRST_SLAB_RATE + (units - SLAB_LIMIT) * SECOND_SLAB_RATE;
    }
}
