package classes_objects.class_problems;

// University course supporting theory-only and lab courses through chained constructors.
public class Course {

    private final String code;
    private final String title;
    private final int credits;
    private final int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Course code is required");
        }
        if (credits < 0 || labCredits < 0) {
            throw new IllegalArgumentException("Credits cannot be negative");
        }
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }
}
