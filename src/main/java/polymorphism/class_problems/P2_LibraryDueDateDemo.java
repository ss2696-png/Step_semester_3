package polymorphism.class_problems;

import java.util.Scanner;

// Feeds the sample borrowed items from the practice sheet into the due date calculator.
public class P2_LibraryDueDateDemo {
    public static void main(String[] args) {
        String input = "3\nBOOK \"1984\"\nDVD \"The Matrix\"\nMAGAZINE \"Forbes Issue 500\"\n";
        System.out.println(DueDateCalculator.process(DueDateCalculator.read(new Scanner(input))));
    }
}
