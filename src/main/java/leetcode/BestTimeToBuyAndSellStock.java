package leetcode;
public class BestTimeToBuyAndSellStock {
    /*
     * Input: prices = [7,1,5,3,6,4] Output: 5 Input: prices = [7,6,4,3,1] Output: 0
     */
    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9};

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
    }
    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            }
                else if(prices[i]-minValue > maxProfit){
                    maxProfit = prices[i] - minValue;
                }
            }
        return maxProfit;
        }
    }

