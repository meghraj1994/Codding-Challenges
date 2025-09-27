package phase1;

public class B_Best_Time_To_Buy_And_Sell_Stock_On_Single_Day {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};    //6-1 =5 => max-min
        int[] prices1 = {7, 6, 4, 3, 1};  //0

        System.out.println(buyAndSellStock(prices));
        System.out.println(buyAndSellStock(prices1));
    }

    public static int buyAndSellStock(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            } else if ((prices[i] - minValue) > maxProfit) {
                maxProfit = prices[i] - minValue;

            }
        }
        return maxProfit;
    }
}
