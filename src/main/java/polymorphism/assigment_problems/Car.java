package polymorphism.assigment_problems;

// Car parked at 30 rupees for the first hour and 20 for each extra hour.
public class Car extends ParkedVehicle {
    public Car(int hours) {
        super(hours);
    }

    @Override
    public String getType() {
        return "CAR";
    }

    @Override
    public double charge() {
        return 30 + 20.0 * (getHours() - 1);
    }
}
