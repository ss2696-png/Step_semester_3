package polymorphism.assigment_problems;

// Staff customer who gets a 5% discount.
public class StaffCustomer extends Customer {
    public StaffCustomer(double billAmount) {
        super(billAmount);
    }

    @Override
    public String getType() {
        return "STAFF";
    }

    @Override
    public double finalAmount() {
        return getBillAmount() * 0.95;
    }
}
