package January2024;

public class BestTimeToBuyAndSellStock2 {

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4}; //7
        int[] prices2 = {1, 2, 3, 4, 5};  //4
        System.out.println(maxPrifit(prices1));
        System.out.println(maxPrifit(prices2));

    }

    public static int maxPrifit(int[] prices) {
        int max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max_profit += prices[i] - prices[i - 1];
            }
        }
        return max_profit;
    }
}
