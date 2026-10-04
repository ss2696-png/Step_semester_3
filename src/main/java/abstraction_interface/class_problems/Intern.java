package abstraction_interface.class_problems;

// Intern paid a fixed weekly stipend.
public class Intern extends StaffMember {
    private final double stipend;

    public Intern(String name, double stipend) {
        super(name);
        this.stipend = requireNonNegative(stipend, "Stipend");
    }

    @Override
    public double weeklyPay() {
        return stipend;
    }
}
