package polymorphism.class_problems;

import java.util.Scanner;

// Feeds the sample journeys from the practice sheet into the fare calculator.
public class P5_TransportFareDemo {
    public static void main(String[] args) {
        String input = "3\nBUS 15\nTRAIN 50\nMETRO 10 1.5\n";
        System.out.println(FareCalculator.process(FareCalculator.read(new Scanner(input))));
    }
}
