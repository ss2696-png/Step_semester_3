package abstraction_interface.class_problems;

import java.util.Scanner;

// Computes late fines for returned library items and the total collected.
public class P3_LateFineDemo {

    static LibraryItem parseItem(Scanner in) {
        String type = in.next();
        String title = in.next();
        int daysLate = in.nextInt();
        switch (type) {
            case "BOOK":
                return new Book(title, daysLate);
            case "DVD":
                return new Dvd(title, daysLate);
            case "MAGAZINE":
                return new Magazine(title, daysLate);
            default:
                throw new IllegalArgumentException("Unknown item type: " + type);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("3\nBOOK Algebra 4\nDVD Inception 12\nMAGAZINE Sports 3\n");
        int n = in.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            LibraryItem item = parseItem(in);
            System.out.printf("%s: %.2f%n", item.getTitle(), item.fine());
            total += item.fine();
        }
        System.out.printf("Total Fines: %.2f%n", total);
    }
}
