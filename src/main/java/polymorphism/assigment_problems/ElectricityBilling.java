package polymorphism.assigment_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Hostel billing desk that reads rooms and prints each bill and the total.
public class ElectricityBilling {
    public static Room create(String[] parts) {
        int units = Integer.parseInt(parts[1]);
        switch (parts[0]) {
            case "SINGLE": return new SingleRoom(units);
            case "SHARED": return new SharedRoom(units, Integer.parseInt(parts[2]));
            case "AC": return new AcRoom(units);
            default: throw new IllegalArgumentException("Unknown room type: " + parts[0]);
        }
    }

    public static List<Room> read(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rooms.add(create(in.nextLine().trim().split("\\s+")));
        }
        return rooms;
    }

    public static String process(List<Room> rooms) {
        StringBuilder out = new StringBuilder();
        double total = 0;
        for (Room room : rooms) {
            double bill = room.bill();
            total += bill;
            out.append(String.format("%s: %.2f%n", room.getType(), bill));
        }
        out.append(String.format("Total: %.2f", total));
        return out.toString();
    }
}
