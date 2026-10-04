package abstraction_interface.assigment_problems;

// Day scholar paying normal tuition and using the college bus.
public class DayScholar extends CollegeStudent implements BusUser {
    private static final double TUITION = 40000;

    public DayScholar(String name) {
        super(name);
    }

    @Override
    protected double tuitionFee() {
        return TUITION;
    }
}
