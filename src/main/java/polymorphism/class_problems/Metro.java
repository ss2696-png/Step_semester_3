package polymorphism.class_problems;

// Metro fare: $1.50 base plus $0.20 per km, scaled by the peak hour factor.
public class Metro extends Transport {
    private final double peakHourFactor;

    public Metro(double distance, double peakHourFactor) {
        super(distance);
        if (peakHourFactor < 1.0 || peakHourFactor > 2.0) {
            throw new IllegalArgumentException("Peak hour factor must be between 1.0 and 2.0");
        }
        this.peakHourFactor = peakHourFactor;
    }

    @Override
    public String getType() {
        return "METRO";
    }

    @Override
    public double fare() {
        return (1.5 + 0.20 * getDistance()) * peakHourFactor;
    }
}
