package practiseagain;

public class Q2BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println(findMaxProfit(prices1));
        System.out.println(findMaxProfit(prices2));
    }

    public static int findMaxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - lowestPrice);

        }


        return maxProfit;
    }


}
