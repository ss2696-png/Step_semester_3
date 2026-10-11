package data_structures.class_problems;

import java.util.Arrays;

// Student with three marks that computes an average and a grade for the result card.
public class Student {
    private static final int SUBJECT_COUNT = 3;

    private final String name;
    private final int[] marks;

    public Student(String name, int[] marks) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Student name is required");
        }
        if (marks == null || marks.length != SUBJECT_COUNT) {
            throw new IllegalArgumentException("Exactly " + SUBJECT_COUNT + " marks are required");
        }
        this.name = name;
        this.marks = Arrays.copyOf(marks, marks.length);
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return Arrays.copyOf(marks, marks.length);
    }

    public double average() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    public char grade() {
        double average = average();
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 40) {
            return 'D';
        }
        return 'F';
    }

    public String resultCard() {
        return String.format("%s: Average %.1f, Grade %c", name.toUpperCase(), average(), grade());
    }
}
