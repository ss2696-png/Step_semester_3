package abstraction_interface.class_problems;

// Hourly staff member paid 1.5x the rate for every hour beyond 40.
public class HourlyStaff extends StaffMember {
    private static final int REGULAR_HOURS = 40;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    private final double hours;
    private final double rate;

    public HourlyStaff(String name, double hours, double rate) {
        super(name);
        this.hours = requireNonNegative(hours, "Hours");
        this.rate = requireNonNegative(rate, "Rate");
    }

    @Override
    public double weeklyPay() {
        double regular = Math.min(hours, REGULAR_HOURS);
        double overtime = Math.max(0, hours - REGULAR_HOURS);
        return regular * rate + overtime * rate * OVERTIME_MULTIPLIER;
    }
}
