package blind75;

public class Q3BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; //7
        int[] prices2 = {1, 2, 3, 4, 5}; // 4

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {

        int profit = 0;

        for(int i=1; i< prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }

        return profit;
    }
}
