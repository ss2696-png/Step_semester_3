package abstraction_interface.assigment_problems;

import java.util.Scanner;

// Runs the movie ticket counter for a batch of bookings.
public class A1_MovieTicketDemo {

    static MovieTicket parseBooking(Scanner in) {
        String seat = in.next();
        int count = in.nextInt();
        switch (seat) {
            case "REGULAR":
                return new RegularTicket(count);
            case "PREMIUM":
                return new PremiumTicket(count);
            case "RECLINER":
                return new ReclinerTicket(count);
            default:
                throw new IllegalArgumentException("Unknown seat type: " + seat);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("3\nREGULAR 3\nPREMIUM 2\nRECLINER 1\n");
        int n = in.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            MovieTicket ticket = parseBooking(in);
            System.out.printf("%s: %.2f%n", ticket.getSeatType(), ticket.amount());
            total += ticket.amount();
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
