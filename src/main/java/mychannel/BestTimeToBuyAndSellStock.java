package mychannel;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4}; //output =5;
        int[] prices2 = {7, 6, 4, 3, 1};    //output =0;

//
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));


    }

    public static int maxProfit(int[] prices) {

        int leastNum = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (leastNum > prices[i]) {
                leastNum = prices[i];

            } else if ((prices[i] - leastNum) > maxProfit) {
                maxProfit = prices[i] - leastNum;
            }
        }
        return maxProfit;

    }

}
