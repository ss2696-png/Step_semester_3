package polymorphism.assigment_problems;

// Base employee holding name and salary; each type decides its festival bonus.
public abstract class Employee {
    private final String name;
    private final double monthlySalary;

    protected Employee(String name, double monthlySalary) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        if (monthlySalary <= 0) {
            throw new IllegalArgumentException("Salary must be positive");
        }
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    protected double getMonthlySalary() {
        return monthlySalary;
    }

    public abstract double bonus();
}
