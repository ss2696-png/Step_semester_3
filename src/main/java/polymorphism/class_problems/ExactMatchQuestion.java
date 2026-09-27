package polymorphism.class_problems;

// Question that awards full points only when the answer matches exactly.
public abstract class ExactMatchQuestion extends Question {
    protected ExactMatchQuestion(String text, String correctAnswer, int points) {
        super(text, correctAnswer, points);
    }

    @Override
    public double grade(String studentAnswer) {
        return getCorrectAnswer().equals(studentAnswer) ? getPoints() : 0;
    }
}
