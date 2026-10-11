package data_structures.class_problems;

// Prints result cards for the sample students.
public class P10_ResultCardDemo {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Asha", new int[] {80, 90, 70}),
            new Student("Ravi", new int[] {60, 55, 50})
        };
        for (Student student : students) {
            System.out.println(student.resultCard());
        }
    }
}
