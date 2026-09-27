package polymorphism.class_problems;

// Express delivery: $15 base, $1.00 per kg, $0.20 per km.
public class ExpressDelivery extends Delivery {
    public ExpressDelivery(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public String getType() {
        return "EXPRESS";
    }

    @Override
    protected double baseFee() {
        return 15;
    }

    @Override
    protected double perKg() {
        return 1.0;
    }

    @Override
    protected double perKm() {
        return 0.2;
    }
}
