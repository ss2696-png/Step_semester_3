package classes_objects.assigment_problems;

// Employee profile that supports permanent staff and interns through constructor chaining.
public class Employee {

    private final String empId;
    private final String empName;
    private final double salary;
    private boolean isIntern;

    public Employee(String empId, String empName, double salary) {
        if (empId == null || empId.isBlank() || empName == null || empName.isBlank()) {
            throw new IllegalArgumentException("Employee id and name are required");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}
