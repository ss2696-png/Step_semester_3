package encapsulation.class_problems;

// Kid's savings jar where the balance only moves through deposit and withdraw.
public class PiggyBank {
    private final String id;
    private int savings;

    public PiggyBank(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Piggy bank ID cannot be blank");
        }
        this.id = id;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        savings += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0 || amount > savings) {
            return false;
        }
        savings -= amount;
        return true;
    }

    public int getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }
}
