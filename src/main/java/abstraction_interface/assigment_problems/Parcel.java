package abstraction_interface.assigment_problems;

// Parcel with weight and declared value; each parcel type defines its shipping charge.
public abstract class Parcel {
    private final double weightKg;
    private final double declaredValue;

    protected Parcel(double weightKg, double declaredValue) {
        if (weightKg <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        if (declaredValue < 0) {
            throw new IllegalArgumentException("Declared value cannot be negative");
        }
        this.weightKg = weightKg;
        this.declaredValue = declaredValue;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double getDeclaredValue() {
        return declaredValue;
    }

    public abstract String getType();

    public abstract double shippingCharge();
}
