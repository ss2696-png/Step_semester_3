package classes_objects.assigment_problems;

// Credits a bonus, deducts tax and shows invalid payroll updates being rejected.
public class A2_PayrollAccountDemo {

    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.println("Net salary: Rs " + account.getNetSalary());

        account.creditBonus(-200);
        account.deductTax(120);
        new PayrollAccount(-1000);
    }
}
