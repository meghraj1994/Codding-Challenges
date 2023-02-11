package sukanya.day5;

public class Stock {

    public static void main(String[] args) {
     int[]prices={7,1,5,3,6,4};
        System.out.println(calculateProfit(prices));
    }

    //maximum profit//
   static int calculateProfit(int[] prices){
       int profit=0;
         for(int i=0;i<prices.length-1;i++){

             if(prices[i+1]> prices[i]){
                  profit += prices[i + 1] - prices[i];
             }
         }
        return profit;

    }

}
