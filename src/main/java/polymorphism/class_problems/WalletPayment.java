package polymorphism.class_problems;

// Wallet payment with a 1% processing fee.
public class WalletPayment extends Payment {
    public WalletPayment(double amount) {
        super(amount);
    }

    @Override
    public String getType() {
        return "WALLET";
    }

    @Override
    protected double feeRate() {
        return 0.01;
    }
}
