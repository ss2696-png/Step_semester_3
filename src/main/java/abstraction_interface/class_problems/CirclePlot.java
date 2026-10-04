package abstraction_interface.class_problems;

// Circular garden plot measured by its radius.
public class CirclePlot extends GardenPlot {
    private final double radius;

    public CirclePlot(String owner, double radius) {
        super(owner);
        this.radius = requirePositive(radius, "Radius");
    }

    @Override
    public String getShape() {
        return "CIRCLE";
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
