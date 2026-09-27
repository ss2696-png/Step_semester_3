package polymorphism.assigment_problems;

// Intern who receives a fixed festival bonus regardless of salary.
public class Intern extends Employee {
    private static final double FIXED_BONUS = 2000;

    public Intern(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    public double bonus() {
        return FIXED_BONUS;
    }
}
