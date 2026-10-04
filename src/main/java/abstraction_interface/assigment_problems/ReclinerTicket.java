package abstraction_interface.assigment_problems;

// Recliner seat ticket priced at 400 per ticket.
public class ReclinerTicket extends MovieTicket {
    private static final double PRICE = 400;

    public ReclinerTicket(int count) {
        super(count);
    }

    @Override
    public String getSeatType() {
        return "RECLINER";
    }

    @Override
    protected double pricePerTicket() {
        return PRICE;
    }
}
