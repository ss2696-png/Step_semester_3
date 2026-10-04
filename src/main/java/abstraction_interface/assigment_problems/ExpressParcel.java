package abstraction_interface.assigment_problems;

// Express parcel charged 80 plus 15 per kg; can be insured.
public class ExpressParcel extends Parcel implements Insurable {
    private static final double BASE = 80;
    private static final double PER_KG = 15;

    public ExpressParcel(double weightKg, double declaredValue) {
        super(weightKg, declaredValue);
    }

    @Override
    public String getType() {
        return "EXPRESS";
    }

    @Override
    public double shippingCharge() {
        return BASE + getWeightKg() * PER_KG;
    }
}
