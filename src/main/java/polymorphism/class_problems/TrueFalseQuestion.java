package polymorphism.class_problems;

// True/false question graded by exact match.
public class TrueFalseQuestion extends ExactMatchQuestion {
    public TrueFalseQuestion(String text, String correctAnswer, int points) {
        super(text, correctAnswer, points);
    }

    @Override
    public String getType() {
        return "TF";
    }
}
