package polymorphism.class_problems;

// Card payment with a 2% processing fee.
public class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public String getType() {
        return "CARD";
    }

    @Override
    protected double feeRate() {
        return 0.02;
    }
}
