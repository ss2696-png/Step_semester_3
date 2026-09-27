package polymorphism.assigment_problems;

// Shared room billed at 6 rupees per unit, split equally among its occupants.
public class SharedRoom extends Room {
    private final int occupants;

    public SharedRoom(int units, int occupants) {
        super(units);
        if (occupants < 2 || occupants > 4) {
            throw new IllegalArgumentException("Occupants must be between 2 and 4");
        }
        this.occupants = occupants;
    }

    @Override
    public String getType() {
        return "SHARED";
    }

    @Override
    public double bill() {
        return 6.0 * getUnits() / occupants;
    }
}
