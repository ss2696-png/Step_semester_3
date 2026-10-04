package abstraction_interface.assigment_problems;

// Regular seat ticket priced at 150 per ticket.
public class RegularTicket extends MovieTicket {
    private static final double PRICE = 150;

    public RegularTicket(int count) {
        super(count);
    }

    @Override
    public String getSeatType() {
        return "REGULAR";
    }

    @Override
    protected double pricePerTicket() {
        return PRICE;
    }
}
