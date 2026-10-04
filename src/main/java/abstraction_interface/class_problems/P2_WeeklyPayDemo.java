package abstraction_interface.class_problems;

import java.util.Scanner;

// Builds the weekly payroll screen from staff records.
public class P2_WeeklyPayDemo {

    static StaffMember parseStaff(Scanner in) {
        String type = in.next();
        String name = in.next();
        switch (type) {
            case "FULLTIME":
                return new FullTimeStaff(name, in.nextDouble());
            case "HOURLY":
                return new HourlyStaff(name, in.nextDouble(), in.nextDouble());
            case "INTERN":
                return new Intern(name, in.nextDouble());
            default:
                throw new IllegalArgumentException("Unknown staff type: " + type);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("3\nFULLTIME Asha 12000\nHOURLY Ravi 45 200\nINTERN Neha 5000\n");
        int n = in.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            StaffMember staff = parseStaff(in);
            System.out.printf("%s: %.2f%n", staff.getName(), staff.weeklyPay());
            total += staff.weeklyPay();
        }
        System.out.printf("Total Payroll: %.2f%n", total);
    }
}
