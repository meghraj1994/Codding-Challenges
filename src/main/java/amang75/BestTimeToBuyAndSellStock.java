package amang75;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
       int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){

        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=1; i<prices.length;i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            } else if (prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }
        return maxProfit;
    }
}
