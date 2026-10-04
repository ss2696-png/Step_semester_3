package abstraction_interface.assigment_problems;

// Scholarship student paying half tuition and using the college bus.
public class ScholarshipStudent extends CollegeStudent implements BusUser {
    private static final double TUITION = 20000;

    public ScholarshipStudent(String name) {
        super(name);
    }

    @Override
    protected double tuitionFee() {
        return TUITION;
    }
}
