package arrays.class_problems;

// Computes the best single buy-then-sell profit in one pass over daily prices.
public class StockProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int lowestPrice = prices[0];
        int bestProfit = 0;
        for (int price : prices) {
            if (price < lowestPrice) {
                lowestPrice = price;
            } else if (price - lowestPrice > bestProfit) {
                bestProfit = price - lowestPrice;
            }
        }
        return bestProfit;
    }
}
