package abstraction_interface.class_problems;

import java.util.Scanner;

// Generates monthly electricity bills for each connection and the total billed.
public class P4_ElectricityBillingDemo {

    static ElectricConnection parseConnection(Scanner in) {
        String type = in.next();
        double units = in.nextDouble();
        switch (type) {
            case "HOME":
                return new HomeConnection(units);
            case "SHOP":
                return new ShopConnection(units);
            case "FACTORY":
                return new FactoryConnection(units);
            default:
                throw new IllegalArgumentException("Unknown connection type: " + type);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("3\nHOME 150\nSHOP 90\nFACTORY 120\n");
        int n = in.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            ElectricConnection connection = parseConnection(in);
            System.out.printf("%s: %.2f%n", connection.getType(), connection.bill());
            total += connection.bill();
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
