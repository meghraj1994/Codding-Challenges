package phase1;

public class C_Best_Time_To_Buy_And_Sell_On_Each_Day {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4}; //output =7
        int[] prices1 = {1,2,3,4,5}; //output=4

        System.out.println(bestTimeToBuyAndSell(prices));
        System.out.println(bestTimeToBuyAndSell(prices1));
    }


    public static int bestTimeToBuyAndSell(int[] prices) {
        int profit = 0;

        for(int i=1; i<prices.length;i++) {
            if(prices[i]>prices[i-1]) {
                profit +=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
