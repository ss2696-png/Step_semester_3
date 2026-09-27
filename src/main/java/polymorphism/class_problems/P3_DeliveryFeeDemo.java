package polymorphism.class_problems;

import java.util.Scanner;

// Feeds the sample delivery requests from the practice sheet into the fee calculator.
public class P3_DeliveryFeeDemo {
    public static void main(String[] args) {
        String input = "3\nSTANDARD 10 50\nEXPRESS 5 20\nINTERNATIONAL 20 100 30\n";
        System.out.println(DeliveryFeeCalculator.process(DeliveryFeeCalculator.read(new Scanner(input))));
    }
}
