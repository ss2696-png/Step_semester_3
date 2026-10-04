package abstraction_interface.assigment_problems;

import java.util.Scanner;

// Prints the monthly energy report, honouring saver mode only where supported.
public class A5_ApplianceEnergyDemo {

    static Appliance createAppliance(String name, double hours) {
        switch (name) {
            case "FRIDGE":
                return new Fridge(hours);
            case "AC":
                return new AirConditioner(hours);
            case "TV":
                return new Television(hours);
            case "WASHER":
                return new WashingMachine(hours);
            default:
                throw new IllegalArgumentException("Unknown appliance: " + name);
        }
    }

    public static void main(String[] args) {
        String input = "4\nFRIDGE 24\nAC 8 SAVER\nTV 5\nWASHER 2 SAVER\n";
        Scanner in = new Scanner(input);
        int n = Integer.parseInt(in.nextLine().trim());
        double totalCost = 0;
        for (int i = 0; i < n; i++) {
            String[] parts = in.nextLine().trim().split("\\s+");
            Appliance appliance = createAppliance(parts[0], Double.parseDouble(parts[1]));
            boolean saver = parts.length > 2 && parts[2].equals("SAVER");
            double units;
            if (!saver) {
                units = appliance.units();
            } else if (appliance instanceof SaverMode) {
                units = ((SaverMode) appliance).saverUnits();
            } else {
                System.out.println(appliance.getName() + ": saver mode not supported");
                continue;
            }
            double cost = Appliance.cost(units);
            totalCost += cost;
            System.out.printf("%s: Units=%.2f Cost=%.2f%n", appliance.getName(), units, cost);
        }
        System.out.printf("Total Cost: %.2f%n", totalCost);
    }
}
