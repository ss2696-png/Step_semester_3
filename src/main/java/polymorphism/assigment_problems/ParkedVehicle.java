package polymorphism.assigment_problems;

// Base parked vehicle; each vehicle type applies its own hourly charging rule.
public abstract class ParkedVehicle {
    private final int hours;

    protected ParkedVehicle(int hours) {
        if (hours < 1 || hours > 24) {
            throw new IllegalArgumentException("Hours must be between 1 and 24");
        }
        this.hours = hours;
    }

    protected int getHours() {
        return hours;
    }

    public abstract String getType();

    public abstract double charge();
}
