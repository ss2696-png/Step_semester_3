package polymorphism.assigment_problems;

import java.util.Scanner;

// Feeds the sample rooms from the assignment sheet into the electricity billing desk.
public class A3_HostelElectricityDemo {
    public static void main(String[] args) {
        String input = "3\nSINGLE 120\nSHARED 150 3\nAC 100\n";
        System.out.println(ElectricityBilling.process(ElectricityBilling.read(new Scanner(input))));
    }
}
