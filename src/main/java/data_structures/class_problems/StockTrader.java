package data_structures.class_problems;

// Finds the best single buy-then-sell profit in one pass by tracking the lowest price so far.
public class StockTrader {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int best = 0;
        for (int i = 1; i < prices.length; i++) {
            best = Math.max(best, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return best;
    }
}
