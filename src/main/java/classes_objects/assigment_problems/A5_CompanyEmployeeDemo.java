package classes_objects.assigment_problems;

// Creates three employees and prints the shared company info through the class name.
public class A5_CompanyEmployeeDemo {

    public static void main(String[] args) {
        new CompanyEmployee("Divya", 65000);
        new CompanyEmployee("Arjun", 42000);
        new CompanyEmployee("Kavya", 58000);
        CompanyEmployee.printCompanyInfo();
    }
}
