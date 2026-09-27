package polymorphism.class_problems;

// Essay question that gives partial credit for the keywords mentioned.
public class EssayQuestion extends Question {
    private final String[] keywords;

    public EssayQuestion(String text, String correctAnswer, int points) {
        super(text, correctAnswer, points);
        String[] raw = correctAnswer.split(",");
        keywords = new String[raw.length];
        for (int i = 0; i < raw.length; i++) {
            keywords[i] = raw[i].trim().toLowerCase();
        }
    }

    @Override
    public String getType() {
        return "ESSAY";
    }

    @Override
    public double grade(String studentAnswer) {
        String answer = studentAnswer.toLowerCase();
        int matched = 0;
        for (String keyword : keywords) {
            if (!keyword.isEmpty() && answer.contains(keyword)) {
                matched++;
            }
        }
        if (matched >= 2) {
            return getPoints() * 0.75;
        }
        return matched == 1 ? getPoints() * 0.5 : 0;
    }
}
