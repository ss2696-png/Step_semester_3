package polymorphism.class_problems;

// Base exam question; each question type grades a student answer its own way.
public abstract class Question {
    private final String text;
    private final String correctAnswer;
    private final int points;

    protected Question(String text, String correctAnswer, int points) {
        if (points <= 0) {
            throw new IllegalArgumentException("Points must be positive");
        }
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public String getText() {
        return text;
    }

    protected String getCorrectAnswer() {
        return correctAnswer;
    }

    protected int getPoints() {
        return points;
    }

    public abstract String getType();

    public abstract double grade(String studentAnswer);
}
