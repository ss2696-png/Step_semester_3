package abstraction_interface.assigment_problems;

import java.util.Scanner;

// Runs the college fee counter for a batch of students.
public class A3_CollegeFeeDemo {

    static CollegeStudent parseStudent(Scanner in) {
        String type = in.next();
        String name = in.next();
        switch (type) {
            case "DAY_SCHOLAR":
                return new DayScholar(name);
            case "HOSTELLER":
                return new Hosteller(name);
            case "SCHOLAR":
                return new ScholarshipStudent(name);
            default:
                throw new IllegalArgumentException("Unknown student type: " + type);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("3\nDAY_SCHOLAR Asha\nHOSTELLER Ravi\nSCHOLAR Neha\n");
        int n = in.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            CollegeStudent student = parseStudent(in);
            System.out.printf("%s: %.2f%n", student.getName(), student.totalFee());
            total += student.totalFee();
        }
        System.out.printf("Total Collected: %.2f%n", total);
    }
}
