package polymorphism.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Reads journeys and prints each fare plus the grand total.
public class FareCalculator {
    public static Transport create(String[] parts) {
        double distance = Double.parseDouble(parts[1]);
        switch (parts[0]) {
            case "BUS": return new Bus(distance);
            case "TRAIN": return new Train(distance);
            case "METRO": return new Metro(distance, Double.parseDouble(parts[2]));
            default: throw new IllegalArgumentException("Unknown transport type: " + parts[0]);
        }
    }

    public static List<Transport> read(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        List<Transport> journeys = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            journeys.add(create(in.nextLine().trim().split("\\s+")));
        }
        return journeys;
    }

    public static String process(List<Transport> journeys) {
        StringBuilder out = new StringBuilder();
        double total = 0;
        for (Transport journey : journeys) {
            double fare = journey.fare();
            total += fare;
            out.append(String.format("%s: %.2f%n", journey.getType(), fare));
        }
        out.append(String.format("Total: %.2f", total));
        return out.toString();
    }
}
