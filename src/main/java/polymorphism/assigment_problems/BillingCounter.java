package polymorphism.assigment_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Canteen counter that reads bills and prints each final amount and the total collected.
public class BillingCounter {
    public static Customer create(String type, double amount) {
        switch (type) {
            case "STUDENT": return new StudentCustomer(amount);
            case "STAFF": return new StaffCustomer(amount);
            case "GUEST": return new GuestCustomer(amount);
            default: throw new IllegalArgumentException("Unknown customer type: " + type);
        }
    }

    public static List<Customer> read(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        List<Customer> bills = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = in.nextLine().trim().split("\\s+");
            bills.add(create(parts[0], Double.parseDouble(parts[1])));
        }
        return bills;
    }

    public static String process(List<Customer> bills) {
        StringBuilder out = new StringBuilder();
        double total = 0;
        for (Customer customer : bills) {
            double amount = customer.finalAmount();
            total += amount;
            out.append(String.format("%s: %.2f%n", customer.getType(), amount));
        }
        out.append(String.format("Total: %.2f", total));
        return out.toString();
    }
}
