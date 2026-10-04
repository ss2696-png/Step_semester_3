package abstraction_interface.assigment_problems;

// Hosteller paying tuition plus the hostel fee; lives on campus so no bus.
public class Hosteller extends CollegeStudent {
    private static final double TUITION = 40000;
    private static final double HOSTEL_FEE = 60000;

    public Hosteller(String name) {
        super(name);
    }

    @Override
    protected double tuitionFee() {
        return TUITION + HOSTEL_FEE;
    }
}
