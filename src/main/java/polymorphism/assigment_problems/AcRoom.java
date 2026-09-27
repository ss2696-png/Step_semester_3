package polymorphism.assigment_problems;

// AC room billed at 10 rupees per unit plus a fixed 200 rupee charge.
public class AcRoom extends Room {
    private static final double FIXED_CHARGE = 200;

    public AcRoom(int units) {
        super(units);
    }

    @Override
    public String getType() {
        return "AC";
    }

    @Override
    public double bill() {
        return 10.0 * getUnits() + FIXED_CHARGE;
    }
}
