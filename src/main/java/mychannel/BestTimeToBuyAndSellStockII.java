package mychannel;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};   //output =7
        int[] prices2 = {7,6,4,3,1};     //output = 0
        int[] prices3 = {1,2,3,4,5};    //output =4

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));

    }

    public static int maxProfit(int[] prices) {

        int profit = 0;

        for (int i=0; i<prices.length-1; i++){
            if(prices[i+1]>prices[i]){
                profit += prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}
