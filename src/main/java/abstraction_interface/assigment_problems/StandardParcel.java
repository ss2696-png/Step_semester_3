package abstraction_interface.assigment_problems;

// Standard parcel charged 40 plus 10 per kg.
public class StandardParcel extends Parcel {
    private static final double BASE = 40;
    private static final double PER_KG = 10;

    public StandardParcel(double weightKg, double declaredValue) {
        super(weightKg, declaredValue);
    }

    @Override
    public String getType() {
        return "STANDARD";
    }

    @Override
    public double shippingCharge() {
        return BASE + getWeightKg() * PER_KG;
    }
}
