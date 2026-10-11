package data_structures.class_problems;

// Maps marks out of 100 to a letter grade using an if-else ladder.
public class GradeAssigner {

    public static char gradeFor(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        }
        return 'F';
    }
}
