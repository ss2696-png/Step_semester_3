package polymorphism.assigment_problems;

// Full-time employee earning 10% of monthly salary as bonus.
public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    public double bonus() {
        return getMonthlySalary() * 0.10;
    }
}
