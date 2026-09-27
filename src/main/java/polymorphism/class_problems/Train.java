package polymorphism.class_problems;

// Train fare: $3 base plus $0.15 per km.
public class Train extends Transport {
    public Train(double distance) {
        super(distance);
    }

    @Override
    public String getType() {
        return "TRAIN";
    }

    @Override
    public double fare() {
        return 3 + 0.15 * getDistance();
    }
}
