package abstraction_interface.assigment_problems;

import java.util.Scanner;

// Runs the cab fare meter, rejecting night trips for cabs without night service.
public class A4_CabFareDemo {

    static Cab parseCab(String type, double km) {
        switch (type) {
            case "MINI":
                return new MiniCab(km);
            case "SEDAN":
                return new SedanCab(km);
            case "SUV":
                return new SuvCab(km);
            default:
                throw new IllegalArgumentException("Unknown cab type: " + type);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("4\nMINI 8 DAY\nSEDAN 10 NIGHT\nSUV 20 DAY\nMINI 5 NIGHT\n");
        int n = in.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            Cab cab = parseCab(in.next(), in.nextDouble());
            boolean night = in.next().equals("NIGHT");
            if (!night) {
                total += cab.dayFare();
                System.out.printf("%s: %.2f%n", cab.getType(), cab.dayFare());
            } else if (cab instanceof NightService) {
                double fare = ((NightService) cab).nightFare();
                total += fare;
                System.out.printf("%s: %.2f%n", cab.getType(), fare);
            } else {
                System.out.println(cab.getType() + ": night service not available");
            }
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
