package polymorphism.class_problems;

import java.util.List;
import java.util.Scanner;

// Reads questions with answers, grades each one and prints the total score.
public class ExamGrader {
    public static Question create(String type, String text, String correct, int points) {
        switch (type) {
            case "MCQ": return new McqQuestion(text, correct, points);
            case "TF": return new TrueFalseQuestion(text, correct, points);
            case "ESSAY": return new EssayQuestion(text, correct, points);
            default: throw new IllegalArgumentException("Unknown question type: " + type);
        }
    }

    public static String gradeAll(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        StringBuilder out = new StringBuilder();
        double total = 0;
        for (int i = 0; i < n; i++) {
            List<String> t = LineTokenizer.tokenize(in.nextLine().trim());
            Question question = create(t.get(0), t.get(1), t.get(2), Integer.parseInt(t.get(4)));
            double score = question.grade(t.get(3));
            total += score;
            out.append(String.format("%s: %.2f%n", question.getType(), score));
        }
        out.append(String.format("Total Score: %.2f", total));
        return out.toString();
    }
}
