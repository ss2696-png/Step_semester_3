package classes_objects.class_problems;

// Creates one theory-only and one lab course and prints their total credits.
public class P3_CourseDemo {

    public static void main(String[] args) {
        Course theory = new Course("21CSC201J", "Data Structures", 4);
        Course lab = new Course("21CSC205L", "DSA Lab", 3, 1);
        System.out.println(theory.getCode() + " total credits: " + theory.totalCredits());
        System.out.println(lab.getCode() + " total credits: " + lab.totalCredits());
    }
}
