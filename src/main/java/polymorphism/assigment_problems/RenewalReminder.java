package polymorphism.assigment_problems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Reads subscribers and prints the date each plan must be renewed.
public class RenewalReminder {
    public static SubscriptionPlan create(String type, String name, LocalDate start) {
        switch (type) {
            case "BASIC": return new BasicPlan(name, start);
            case "STANDARD": return new StandardPlan(name, start);
            case "PREMIUM": return new PremiumPlan(name, start);
            default: throw new IllegalArgumentException("Unknown plan type: " + type);
        }
    }

    public static List<SubscriptionPlan> read(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        List<SubscriptionPlan> plans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = in.nextLine().trim().split("\\s+");
            plans.add(create(parts[0], parts[1], LocalDate.parse(parts[2])));
        }
        return plans;
    }

    public static String process(List<SubscriptionPlan> plans) {
        StringBuilder out = new StringBuilder();
        for (SubscriptionPlan plan : plans) {
            out.append(plan.getSubscriber()).append(": ").append(plan.renewalDate()).append('\n');
        }
        return out.toString().trim();
    }
}
