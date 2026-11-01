package data_structures.class_problems;

public class P6_StockTraderDemo {
    public static void main(String[] args) {
        System.out.println(StockTrader.maxProfit(new int[]{7, 1, 5, 3, 6, 4}) + " (buy at 1, sell at 6)");
        System.out.println(StockTrader.maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println("Single pass: O(n), every pair: O(n^2)");
    }
}
