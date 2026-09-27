package polymorphism.assigment_problems;

// Base canteen customer; each kind of customer works out its own final bill.
public abstract class Customer {
    private final double billAmount;

    protected Customer(double billAmount) {
        if (billAmount <= 0) {
            throw new IllegalArgumentException("Bill amount must be positive");
        }
        this.billAmount = billAmount;
    }

    protected double getBillAmount() {
        return billAmount;
    }

    public abstract String getType();

    public abstract double finalAmount();
}
