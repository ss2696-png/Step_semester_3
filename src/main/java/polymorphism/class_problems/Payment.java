package polymorphism.class_problems;

// Base payment type; each method of payment decides its own processing fee.
public abstract class Payment {
    private final double amount;

    protected Payment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract String getType();

    protected abstract double feeRate();

    public double finalAmount() {
        return amount + amount * feeRate();
    }
}
