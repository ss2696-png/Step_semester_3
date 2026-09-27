package polymorphism.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Reads transactions and prints every adjusted amount plus the grand total.
public class PaymentProcessor {
    public static Payment create(String type, double amount) {
        switch (type) {
            case "CARD": return new CardPayment(amount);
            case "WALLET": return new WalletPayment(amount);
            case "BANKTRANSFER": return new BankTransferPayment(amount);
            default: throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }

    public static List<Payment> read(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        List<Payment> payments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = in.nextLine().trim().split("\\s+");
            payments.add(create(parts[0], Double.parseDouble(parts[1])));
        }
        return payments;
    }

    public static String process(List<Payment> payments) {
        StringBuilder out = new StringBuilder();
        double total = 0;
        for (Payment payment : payments) {
            double amount = payment.finalAmount();
            total += amount;
            out.append(String.format("%s: %.2f%n", payment.getType(), amount));
        }
        out.append(String.format("Total: %.2f", total));
        return out.toString();
    }
}
