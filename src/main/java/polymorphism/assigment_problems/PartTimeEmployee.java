package polymorphism.assigment_problems;

// Part-time employee earning 5% of monthly salary as bonus.
public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    public double bonus() {
        return getMonthlySalary() * 0.05;
    }
}
