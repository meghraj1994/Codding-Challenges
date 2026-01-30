package blind75;

public class Q2BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int[] prices2={9,8,7,6,5,3,2};

        System.out.println(findMaxProfit(prices));
        System.out.println(findMaxProfit(prices2));
    }

    public static int findMaxProfit(int[] prices) {

        /*
           profit = buyingPrice < Selling
        *  maxProfit = MaxSelling Price -lowestBuyingPrice
        *
        * */

        int min = prices[0];
        int profit = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            profit = Math.max(profit, price - min);
        }

        return profit;
    }
}
