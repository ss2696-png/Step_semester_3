package classes_objects.assigment_problems;

// Employee whose company name and head count live in static fields shared by every instance.
public class CompanyEmployee {

    private static String companyName = "Bright Horizon Technologies";
    private static int employeeCount = 0;

    private final String empName;
    private final double salary;

    public CompanyEmployee(String empName, double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }
}
