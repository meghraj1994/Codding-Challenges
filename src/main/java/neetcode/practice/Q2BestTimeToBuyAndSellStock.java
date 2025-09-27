package neetcode.practice;

public class Q2BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        System.out.println(calculateMaxProfit(prices1));
        System.out.println(calculateMaxProfit(prices2));

    }
    public static int calculateMaxProfit(int[] prices){
        /*
        * 1) when selling prices is greater than buying price then there is profit
        * 2) when buying prices is lowest and selling price is highest then there is maxProfit
        * */
        int minValue = prices[0];
        int maxProfit =-1;
        for(int i=1; i<prices.length;i++){
            if(prices[i] < minValue){
                minValue =prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i]-minValue);
        }
        return maxProfit;
    }
}
