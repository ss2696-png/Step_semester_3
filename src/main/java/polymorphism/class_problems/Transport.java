package polymorphism.class_problems;

// Base journey; each transport type works out its own fare for the distance.
public abstract class Transport {
    private final double distance;

    protected Transport(double distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }
        this.distance = distance;
    }

    protected double getDistance() {
        return distance;
    }

    public abstract String getType();

    public abstract double fare();
}
