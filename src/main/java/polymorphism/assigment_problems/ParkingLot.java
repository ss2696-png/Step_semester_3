package polymorphism.assigment_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Campus parking lot that reads vehicles and prints each charge and the total.
public class ParkingLot {
    public static ParkedVehicle create(String type, int hours) {
        switch (type) {
            case "BIKE": return new Bike(hours);
            case "CAR": return new Car(hours);
            case "TRUCK": return new Truck(hours);
            default: throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }

    public static List<ParkedVehicle> read(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        List<ParkedVehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = in.nextLine().trim().split("\\s+");
            vehicles.add(create(parts[0], Integer.parseInt(parts[1])));
        }
        return vehicles;
    }

    public static String process(List<ParkedVehicle> vehicles) {
        StringBuilder out = new StringBuilder();
        double total = 0;
        for (ParkedVehicle vehicle : vehicles) {
            double charge = vehicle.charge();
            total += charge;
            out.append(String.format("%s: %.2f%n", vehicle.getType(), charge));
        }
        out.append(String.format("Total: %.2f", total));
        return out.toString();
    }
}
