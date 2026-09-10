package arrays_methods.class_problems;

// Placement drive candidate ranked by a composite of CGPA and coding test score.
public class Candidate implements Comparable<Candidate> {

    private final String name;
    private final double cgpa;
    private final int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Candidate name cannot be blank");
        }
        if (cgpa < 0 || cgpa > 10) {
            throw new IllegalArgumentException("CGPA must be between 0 and 10");
        }
        if (codingScore < 0 || codingScore > 100) {
            throw new IllegalArgumentException("Coding score must be between 0 and 100");
        }
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getCodingScore() {
        return codingScore;
    }

    public double getCompositeScore() {
        return cgpa * 10 + codingScore / 2.0;
    }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.getCompositeScore(), getCompositeScore());
    }
}
