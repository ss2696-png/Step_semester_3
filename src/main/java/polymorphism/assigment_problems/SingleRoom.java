package polymorphism.assigment_problems;

// Single room billed at 8 rupees per unit.
public class SingleRoom extends Room {
    public SingleRoom(int units) {
        super(units);
    }

    @Override
    public String getType() {
        return "SINGLE";
    }

    @Override
    public double bill() {
        return 8.0 * getUnits();
    }
}
