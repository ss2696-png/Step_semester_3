package abstraction_interface.class_problems;

import java.util.Scanner;

// Prints the total for each travel booking including the common booking fee.
public class P5_TravelBookingDemo {

    static TravelBooking parseBooking(Scanner in) {
        String mode = in.next();
        double distance = in.nextDouble();
        switch (mode) {
            case "BUS":
                return new BusBooking(distance);
            case "TRAIN":
                return new TrainBooking(distance);
            case "FLIGHT":
                return new FlightBooking(distance);
            default:
                throw new IllegalArgumentException("Unknown travel mode: " + mode);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("3\nBUS 200\nTRAIN 300\nFLIGHT 500\n");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            TravelBooking booking = parseBooking(in);
            System.out.printf("%s: %.2f%n", booking.getMode(), booking.total());
        }
    }
}
