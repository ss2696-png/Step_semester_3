package encapsulation.assigment_problems;

// Shopping cart that keeps item prices private and reports only total and count.
public class Cart {
    private final String cartId;
    private final int[] prices;
    private int itemCount;

    public Cart(String cartId, int maxItems) {
        if (cartId == null || cartId.isBlank()) {
            throw new IllegalArgumentException("Cart ID cannot be blank");
        }
        if (maxItems <= 0) {
            throw new IllegalArgumentException("Cart size must be positive");
        }
        this.cartId = cartId;
        this.prices = new int[maxItems];
    }

    public boolean addItem(int price) {
        if (price <= 0 || itemCount == prices.length) {
            return false;
        }
        prices[itemCount++] = price;
        return true;
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }
        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getCartId() {
        return cartId;
    }
}
