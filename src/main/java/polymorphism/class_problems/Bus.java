package polymorphism.class_problems;

// Bus fare: $2 base plus $0.10 per km, capped at $10.
public class Bus extends Transport {
    private static final double MAX_FARE = 10;

    public Bus(double distance) {
        super(distance);
    }

    @Override
    public String getType() {
        return "BUS";
    }

    @Override
    public double fare() {
        return Math.min(MAX_FARE, 2 + 0.10 * getDistance());
    }
}
