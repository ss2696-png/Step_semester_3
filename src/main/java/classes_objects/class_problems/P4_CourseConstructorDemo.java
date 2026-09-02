package classes_objects.class_problems;

// Builds a course through its constructor and prints it.
public class P4_CourseConstructorDemo {
    public static void main(String[] args) {
        Course course = new Course("21CSC201J", "Data Structures");
        System.out.println(course.code + " - " + course.title);
    }
}
