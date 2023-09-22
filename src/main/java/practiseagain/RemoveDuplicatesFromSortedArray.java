package practiseagain;

public class RemoveDuplicatesFromSortedArray {


    public static void main(String[] args) {

        int[] prices = {1,2,3,4,5};

        System.out.println(maxProfit(prices));
    }


    public static int maxProfit(int[] prices) {
        int profit = 0;

        for(int i =0 ; i < prices.length-1 ; i++) {
            if(prices[i]<prices[i+1]) {
                profit += (prices[i+1] - prices[i]);
            }
        }
        return profit;
    }

}
