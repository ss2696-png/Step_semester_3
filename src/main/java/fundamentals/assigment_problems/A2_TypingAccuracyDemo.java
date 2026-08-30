package fundamentals.assigment_problems;

// Scores sample typing attempts.
public class A2_TypingAccuracyDemo {

    public static void main(String[] args) {
        TypingAccuracyChecker checker = new TypingAccuracyChecker();
        checker.checkTypingAccuracy("hello world", "hello worlt");
        checker.checkTypingAccuracy("coding", "coding");
    }
}
