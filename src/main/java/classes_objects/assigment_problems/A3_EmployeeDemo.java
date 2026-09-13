package classes_objects.assigment_problems;

// Creates a permanent employee and an intern and prints both profiles.
public class A3_EmployeeDemo {

    public static void main(String[] args) {
        Employee permanent = new Employee("E-101", "Divya", 65000);
        Employee intern = new Employee("E-102", "Arjun");
        permanent.printProfile();
        intern.printProfile();
    }
}
