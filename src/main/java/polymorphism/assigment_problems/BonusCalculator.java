package polymorphism.assigment_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Payroll step that reads employees and prints each festival bonus and the total.
public class BonusCalculator {
    public static Employee create(String type, String name, double salary) {
        switch (type) {
            case "FULLTIME": return new FullTimeEmployee(name, salary);
            case "PARTTIME": return new PartTimeEmployee(name, salary);
            case "INTERN": return new Intern(name, salary);
            default: throw new IllegalArgumentException("Unknown employee type: " + type);
        }
    }

    public static List<Employee> read(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = in.nextLine().trim().split("\\s+");
            employees.add(create(parts[0], parts[1], Double.parseDouble(parts[2])));
        }
        return employees;
    }

    public static String process(List<Employee> employees) {
        StringBuilder out = new StringBuilder();
        double total = 0;
        for (Employee employee : employees) {
            double bonus = employee.bonus();
            total += bonus;
            out.append(String.format("%s: %.2f%n", employee.getName(), bonus));
        }
        out.append(String.format("Total Bonus: %.2f", total));
        return out.toString();
    }
}
