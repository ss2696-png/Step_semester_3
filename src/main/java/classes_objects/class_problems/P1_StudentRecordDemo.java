package classes_objects.class_problems;

// Creates one student record and prints its fields.
public class P1_StudentRecordDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Divya";
        student.marks = 88;
        System.out.println("Name: " + student.name + " | Marks: " + student.marks);
    }
}
