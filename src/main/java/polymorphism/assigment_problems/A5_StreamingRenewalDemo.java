package polymorphism.assigment_problems;

import java.util.Scanner;

// Feeds the sample subscribers from the assignment sheet into the renewal reminder.
public class A5_StreamingRenewalDemo {
    public static void main(String[] args) {
        String input = "4\nBASIC Asha 2024-01-15\nSTANDARD Ravi 2024-02-01\nPREMIUM Neha 2024-03-10\nBASIC Kiran 2024-12-20\n";
        System.out.println(RenewalReminder.process(RenewalReminder.read(new Scanner(input))));
    }
}
