package polymorphism.assigment_problems;

// Guest customer who pays the full bill plus a service charge.
public class GuestCustomer extends Customer {
    private static final double SERVICE_CHARGE = 10;

    public GuestCustomer(double billAmount) {
        super(billAmount);
    }

    @Override
    public String getType() {
        return "GUEST";
    }

    @Override
    public double finalAmount() {
        return getBillAmount() + SERVICE_CHARGE;
    }
}
