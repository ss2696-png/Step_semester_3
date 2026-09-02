package classes_objects.assigment_problems;

// Prints a fresh Employee's fields to reveal their default values.
public class A3_EmployeeDefaultsDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Name: " + employee.empName);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Permanent: " + employee.permanent);
    }
}
