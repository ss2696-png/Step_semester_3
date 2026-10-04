package abstraction_interface.class_problems;

// Full-time staff member paid a fixed weekly salary.
public class FullTimeStaff extends StaffMember {
    private final double weeklySalary;

    public FullTimeStaff(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = requireNonNegative(weeklySalary, "Weekly salary");
    }

    @Override
    public double weeklyPay() {
        return weeklySalary;
    }
}
