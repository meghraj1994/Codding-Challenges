package leetcode;/*
* Input: prices = [7,1,5,3,6,4] Output: 7
         Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
*        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
          Total profit is 4 + 3 = 7.

*Input: prices = [7,6,4,3,1] Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
* */


public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        int[] prices3 = {1,2,3,4,5};

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));

    }

    public static int maxProfit(int[] prices) {
      int profit =0;

      for(int i=0; i<prices.length-1; i++) {
          if(prices[i]<prices[i+1]) {
              profit +=prices[i+1]-prices[i];
          }
      }
      return profit;
    }
}
