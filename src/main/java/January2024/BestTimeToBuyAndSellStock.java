package January2024;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7,6,5,4,3,2,1};
        System.out.println(maxProfit(prices));
        System.out.println("-------------------");
        System.out.println(maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {

        int max_profit = 0;
        int min_value = Integer.MAX_VALUE;


        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_value) {
                min_value = prices[i];
            } else if ((prices[i] - min_value) > max_profit) {
                max_profit = prices[i] - min_value;
            }
        }
        return max_profit;

    }
}
