package abstraction_interface.assigment_problems;

// Capability for parcels that can be insured at 2% of the declared value.
public interface Insurable {
    double INSURANCE_RATE = 0.02;

    double getDeclaredValue();

    default double insurance() {
        return getDeclaredValue() * INSURANCE_RATE;
    }
}
