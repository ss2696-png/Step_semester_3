package abstraction_interface.assigment_problems;

import java.util.Scanner;

// Runs the parcel shipping desk, adding insurance only for insurable parcels.
public class A2_ParcelShippingDemo {

    static Parcel parseParcel(Scanner in) {
        String type = in.next();
        double weight = in.nextDouble();
        double value = in.nextDouble();
        switch (type) {
            case "STANDARD":
                return new StandardParcel(weight, value);
            case "EXPRESS":
                return new ExpressParcel(weight, value);
            case "FRAGILE":
                return new FragileParcel(weight, value);
            default:
                throw new IllegalArgumentException("Unknown parcel type: " + type);
        }
    }

    static double insuranceFor(Parcel parcel) {
        if (parcel instanceof Insurable) {
            return ((Insurable) parcel).insurance();
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("3\nSTANDARD 3 500\nEXPRESS 2 1000\nFRAGILE 4 2000\n");
        int n = in.nextInt();
        double grandTotal = 0;
        for (int i = 0; i < n; i++) {
            Parcel parcel = parseParcel(in);
            double charge = parcel.shippingCharge();
            double insurance = insuranceFor(parcel);
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                    parcel.getType(), charge, insurance, charge + insurance);
            grandTotal += charge + insurance;
        }
        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}
