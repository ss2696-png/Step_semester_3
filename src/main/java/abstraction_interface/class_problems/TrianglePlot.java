package abstraction_interface.class_problems;

// Triangular garden plot measured by base and height.
public class TrianglePlot extends GardenPlot {
    private final double base;
    private final double height;

    public TrianglePlot(String owner, double base, double height) {
        super(owner);
        this.base = requirePositive(base, "Base");
        this.height = requirePositive(height, "Height");
    }

    @Override
    public String getShape() {
        return "TRIANGLE";
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
