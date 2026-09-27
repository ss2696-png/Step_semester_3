package polymorphism.class_problems;

// Multiple choice question graded by exact match.
public class McqQuestion extends ExactMatchQuestion {
    public McqQuestion(String text, String correctAnswer, int points) {
        super(text, correctAnswer, points);
    }

    @Override
    public String getType() {
        return "MCQ";
    }
}
