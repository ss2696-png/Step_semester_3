package polymorphism.assigment_problems;

// Student customer who gets a 10% discount.
public class StudentCustomer extends Customer {
    public StudentCustomer(double billAmount) {
        super(billAmount);
    }

    @Override
    public String getType() {
        return "STUDENT";
    }

    @Override
    public double finalAmount() {
        return getBillAmount() * 0.90;
    }
}
