package data_structures.class_problems;

// Prints the grade for each sample mark.
public class P8_GradeAssignerDemo {
    public static void main(String[] args) {
        int[] marks = {72, 95, 35};
        for (int mark : marks) {
            System.out.println("Grade " + GradeAssigner.gradeFor(mark));
        }
    }
}
