package abstraction_interface.assigment_problems;

// College student with a tuition rule; bus users automatically add the transport fee.
public abstract class CollegeStudent {
    private final String name;

    protected CollegeStudent(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Student name is required");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract double tuitionFee();

    public final double totalFee() {
        double fee = tuitionFee();
        if (this instanceof BusUser) {
            fee += BusUser.TRANSPORT_FEE;
        }
        return fee;
    }
}
