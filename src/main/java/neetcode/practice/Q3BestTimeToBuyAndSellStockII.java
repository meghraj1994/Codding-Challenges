package neetcode.practice;

public class Q3BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4}; //output = 7
        int[] prices1={1,2,3,4,5};   //output =4;

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices1));
    }

    public static int maxProfit(int[] prices){
        int maxProfit =0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxProfit +=prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}
