package polymorphism.assigment_problems;

// Truck parked at 50 rupees per hour with a 100 rupee minimum.
public class Truck extends ParkedVehicle {
    public Truck(int hours) {
        super(hours);
    }

    @Override
    public String getType() {
        return "TRUCK";
    }

    @Override
    public double charge() {
        return Math.max(100, 50.0 * getHours());
    }
}
