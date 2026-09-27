package polymorphism.class_problems;

// Standard delivery: $5 base, $0.50 per kg, $0.10 per km.
public class StandardDelivery extends Delivery {
    public StandardDelivery(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public String getType() {
        return "STANDARD";
    }

    @Override
    protected double baseFee() {
        return 5;
    }

    @Override
    protected double perKg() {
        return 0.5;
    }

    @Override
    protected double perKm() {
        return 0.1;
    }
}
