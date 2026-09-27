package polymorphism.assigment_problems;

// Base hostel room; each room type calculates its own monthly electricity bill.
public abstract class Room {
    private final int units;

    protected Room(int units) {
        if (units <= 0) {
            throw new IllegalArgumentException("Units must be positive");
        }
        this.units = units;
    }

    protected int getUnits() {
        return units;
    }

    public abstract String getType();

    public abstract double bill();
}
