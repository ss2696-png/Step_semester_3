package polymorphism.assigment_problems;

import java.util.Scanner;

// Feeds the sample vehicles from the assignment sheet into the parking lot.
public class A2_ParkingChargeDemo {
    public static void main(String[] args) {
        String input = "4\nBIKE 3\nCAR 4\nTRUCK 1\nCAR 1\n";
        System.out.println(ParkingLot.process(ParkingLot.read(new Scanner(input))));
    }
}
