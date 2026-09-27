package polymorphism.class_problems;

import java.util.Scanner;

// Feeds the sample transactions from the practice sheet into the payment processor.
public class P1_PaymentSystemDemo {
    public static void main(String[] args) {
        String input = "3\nCARD 1000\nWALLET 500\nBANKTRANSFER 2000\n";
        System.out.println(PaymentProcessor.process(PaymentProcessor.read(new Scanner(input))));
    }
}
