package polymorphism.class_problems;

import java.util.Scanner;

// Feeds the sample questions from the practice sheet into the exam grader.
public class P4_ExamGraderDemo {
    public static void main(String[] args) {
        String input = "4\n"
                + "MCQ \"What is the capital of France?\" \"Paris\" \"Paris\" 10\n"
                + "TF \"The Earth is flat?\" \"False\" \"True\" 5\n"
                + "ESSAY \"Name two primary OOP principles.\" \"Inheritance, Polymorphism, Encapsulation\" \"Polymorphism is one.\" 20\n"
                + "ESSAY \"Describe abstraction and composition.\" \"Abstraction, Composition\" \"I talked about abstraction.\" 15\n";
        System.out.println(ExamGrader.gradeAll(new Scanner(input)));
    }
}
