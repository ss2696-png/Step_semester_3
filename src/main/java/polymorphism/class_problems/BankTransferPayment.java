package polymorphism.class_problems;

// Bank transfer that carries no processing fee.
public class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    public String getType() {
        return "BANKTRANSFER";
    }

    @Override
    protected double feeRate() {
        return 0;
    }
}
