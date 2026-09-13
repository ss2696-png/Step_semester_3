package classes_objects.class_problems;

// Creates two students and prints the shared college info through the class name.
public class P5_StudentDemo {

    public static void main(String[] args) {
        new Student("Ravi", 88.5);
        new Student("Anitha", 92.0);
        Student.printCollegeInfo();
    }
}
