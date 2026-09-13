package classes_objects.assigment_problems;

// Payroll account that only exposes net salary and guards bonus and tax updates.
public class PayrollAccount {

    private double basicSalary;
    private double bonus;

    public PayrollAccount(double openingBasicSalary) {
        if (openingBasicSalary < 0) {
            System.out.println("Warning: negative basic salary, starting at 0");
            openingBasicSalary = 0;
        }
        this.basicSalary = openingBasicSalary;
    }

    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Bonus rejected: amount must be positive");
            return;
        }
        bonus += amount;
        System.out.println("Bonus credited: Rs " + amount);
    }

    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Tax rejected: percent must be between 0 and 100");
            return;
        }
        basicSalary -= basicSalary * percent / 100;
        System.out.println("Tax deducted: " + (int) percent + "%");
    }

    public double getNetSalary() {
        return basicSalary + bonus;
    }
}
