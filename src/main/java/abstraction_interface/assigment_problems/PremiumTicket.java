package abstraction_interface.assigment_problems;

// Premium seat ticket priced at 250 per ticket.
public class PremiumTicket extends MovieTicket {
    private static final double PRICE = 250;

    public PremiumTicket(int count) {
        super(count);
    }

    @Override
    public String getSeatType() {
        return "PREMIUM";
    }

    @Override
    protected double pricePerTicket() {
        return PRICE;
    }
}
