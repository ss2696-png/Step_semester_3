package abstraction_interface.class_problems;

// Base type for every rented garden plot; each shape supplies its own area formula.
public abstract class GardenPlot {
    private final String owner;

    protected GardenPlot(String owner) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("Owner name is required");
        }
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public abstract String getShape();

    public abstract double area();

    protected static double requirePositive(double value, String label) {
        if (value <= 0) {
            throw new IllegalArgumentException(label + " must be positive");
        }
        return value;
    }
}
