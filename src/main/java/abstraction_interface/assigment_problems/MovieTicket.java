package abstraction_interface.assigment_problems;

// Abstract cinema ticket; the convenience fee lives here once and seat types only supply a price.
public abstract class MovieTicket {
    public static final double CONVENIENCE_FEE = 20;

    private final int count;

    protected MovieTicket(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Ticket count must be positive");
        }
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public abstract String getSeatType();

    protected abstract double pricePerTicket();

    public final double amount() {
        return count * (pricePerTicket() + CONVENIENCE_FEE);
    }
}
