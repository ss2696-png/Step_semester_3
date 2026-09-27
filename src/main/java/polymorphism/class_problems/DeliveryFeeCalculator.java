package polymorphism.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Reads delivery requests and prints each fee plus the grand total.
public class DeliveryFeeCalculator {
    public static Delivery create(String[] parts) {
        double weight = Double.parseDouble(parts[1]);
        double distance = Double.parseDouble(parts[2]);
        switch (parts[0]) {
            case "STANDARD": return new StandardDelivery(weight, distance);
            case "EXPRESS": return new ExpressDelivery(weight, distance);
            case "INTERNATIONAL": return new InternationalDelivery(weight, distance, Double.parseDouble(parts[3]));
            default: throw new IllegalArgumentException("Unknown delivery type: " + parts[0]);
        }
    }

    public static List<Delivery> read(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        List<Delivery> deliveries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            deliveries.add(create(in.nextLine().trim().split("\\s+")));
        }
        return deliveries;
    }

    public static String process(List<Delivery> deliveries) {
        StringBuilder out = new StringBuilder();
        double total = 0;
        for (Delivery delivery : deliveries) {
            double fee = delivery.fee();
            total += fee;
            out.append(String.format("%s: %.2f%n", delivery.getType(), fee));
        }
        out.append(String.format("Total: %.2f", total));
        return out.toString();
    }
}
