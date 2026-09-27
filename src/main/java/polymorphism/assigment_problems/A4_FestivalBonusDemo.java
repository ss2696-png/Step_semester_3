package polymorphism.assigment_problems;

import java.util.Scanner;

// Feeds the sample employees from the assignment sheet into the bonus calculator.
public class A4_FestivalBonusDemo {
    public static void main(String[] args) {
        String input = "3\nFULLTIME Asha 50000\nPARTTIME Ravi 30000\nINTERN Neha 15000\n";
        System.out.println(BonusCalculator.process(BonusCalculator.read(new Scanner(input))));
    }
}
