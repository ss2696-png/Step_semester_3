package encapsulation.assigment_problems;

// Traffic light that can only step forward through red, green and yellow.
public class TrafficLight {
    private static final String[] CYCLE = {"RED", "GREEN", "YELLOW"};

    private final String id;
    private int colorIndex;

    public TrafficLight(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Light ID cannot be blank");
        }
        this.id = id;
    }

    public String next() {
        colorIndex = (colorIndex + 1) % CYCLE.length;
        return getColor();
    }

    public String getColor() {
        return CYCLE[colorIndex];
    }

    public String getId() {
        return id;
    }
}
