package abstraction_interface.class_problems;

// Rectangular garden plot measured by length and width.
public class RectanglePlot extends GardenPlot {
    private final double length;
    private final double width;

    public RectanglePlot(String owner, double length, double width) {
        super(owner);
        this.length = requirePositive(length, "Length");
        this.width = requirePositive(width, "Width");
    }

    @Override
    public String getShape() {
        return "RECTANGLE";
    }

    @Override
    public double area() {
        return length * width;
    }
}
