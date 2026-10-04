package abstraction_interface.assigment_problems;

// Fragile parcel charged the standard rate plus a handling fee; can be insured.
public class FragileParcel extends StandardParcel implements Insurable {
    private static final double HANDLING_FEE = 50;

    public FragileParcel(double weightKg, double declaredValue) {
        super(weightKg, declaredValue);
    }

    @Override
    public String getType() {
        return "FRAGILE";
    }

    @Override
    public double shippingCharge() {
        return super.shippingCharge() + HANDLING_FEE;
    }
}
