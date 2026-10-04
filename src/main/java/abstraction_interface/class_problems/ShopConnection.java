package abstraction_interface.class_problems;

// Shop connection billed 8 per unit plus a fixed charge of 100.
public class ShopConnection extends ElectricConnection {
    private static final double RATE = 8;
    private static final double FIXED_CHARGE = 100;

    public ShopConnection(double units) {
        super(units);
    }

    @Override
    public String getType() {
        return "SHOP";
    }

    @Override
    public double bill() {
        return getUnits() * RATE + FIXED_CHARGE;
    }
}
