package polymorphism.assigment_problems;

// Bike parked at 10 rupees per hour.
public class Bike extends ParkedVehicle {
    public Bike(int hours) {
        super(hours);
    }

    @Override
    public String getType() {
        return "BIKE";
    }

    @Override
    public double charge() {
        return 10.0 * getHours();
    }
}
