package polymorphism.class_problems;

// International delivery: $25 base, $2.00 per kg, $0.50 per km plus customs.
public class InternationalDelivery extends Delivery {
    private final double customsFee;

    public InternationalDelivery(double weight, double distance, double customsFee) {
        super(weight, distance);
        if (customsFee < 0) {
            throw new IllegalArgumentException("Customs fee cannot be negative");
        }
        this.customsFee = customsFee;
    }

    @Override
    public String getType() {
        return "INTERNATIONAL";
    }

    @Override
    protected double baseFee() {
        return 25;
    }

    @Override
    protected double perKg() {
        return 2.0;
    }

    @Override
    protected double perKm() {
        return 0.5;
    }

    @Override
    public double fee() {
        return super.fee() + customsFee;
    }
}
