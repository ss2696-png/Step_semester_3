package polymorphism.assigment_problems;

import java.util.Scanner;

// Feeds the sample bills from the assignment sheet into the billing counter.
public class A1_CanteenBillingDemo {
    public static void main(String[] args) {
        String input = "3\nSTUDENT 200\nSTAFF 300\nGUEST 150\n";
        System.out.println(BillingCounter.process(BillingCounter.read(new Scanner(input))));
    }
}
