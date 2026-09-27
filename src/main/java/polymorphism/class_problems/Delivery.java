package polymorphism.class_problems;

// Base delivery request; every delivery type charges base + per kg + per km.
public abstract class Delivery {
    private final double weight;
    private final double distance;

    protected Delivery(double weight, double distance) {
        if (weight <= 0 || distance <= 0) {
            throw new IllegalArgumentException("Weight and distance must be positive");
        }
        this.weight = weight;
        this.distance = distance;
    }

    public abstract String getType();

    protected abstract double baseFee();

    protected abstract double perKg();

    protected abstract double perKm();

    public double fee() {
        return baseFee() + weight * perKg() + distance * perKm();
    }
}
