package abstraction_interface.class_problems;

// Abstract staff member; every concrete staff type must define its own weekly pay rule.
public abstract class StaffMember {
    private final String name;

    protected StaffMember(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Staff name is required");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double weeklyPay();

    protected static double requireNonNegative(double value, String label) {
        if (value < 0) {
            throw new IllegalArgumentException(label + " cannot be negative");
        }
        return value;
    }
}
