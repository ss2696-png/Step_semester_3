package abstraction_interface.class_problems;

import java.util.Scanner;

// Reads garden plot records and prints the area report with the total rented area.
public class P1_GardenPlotDemo {

    static GardenPlot parsePlot(Scanner in) {
        String shape = in.next();
        String owner = in.next();
        switch (shape) {
            case "CIRCLE":
                return new CirclePlot(owner, in.nextDouble());
            case "RECTANGLE":
                return new RectanglePlot(owner, in.nextDouble(), in.nextDouble());
            case "TRIANGLE":
                return new TrianglePlot(owner, in.nextDouble(), in.nextDouble());
            default:
                throw new IllegalArgumentException("Unknown plot shape: " + shape);
        }
    }

    static void printReport(GardenPlot[] plots) {
        double total = 0;
        for (GardenPlot plot : plots) {
            if (plot == null) {
                continue;
            }
            System.out.printf("%s (%s): %.2f%n", plot.getOwner(), plot.getShape(), plot.area());
            total += plot.area();
        }
        System.out.printf("Total Area: %.2f%n", total);
    }

    public static void main(String[] args) {
        String input = "3\nCIRCLE Asha 5\nRECTANGLE Ravi 4 6\nTRIANGLE Neha 10 3\n";
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        GardenPlot[] plots = new GardenPlot[n];
        for (int i = 0; i < n; i++) {
            plots[i] = parsePlot(in);
        }
        printReport(plots);
    }
}
