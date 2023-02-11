package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(19)); //output =true
        System.out.println(isHappyNumber(2));  //output =false;

        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    public static boolean isHappyNumber(int n) {
        Set<Integer> set = new HashSet<>();

        while (true) {
            int sum = 0;

            while (n != 0) {
                int x= n%10;
                sum = sum + x*x;
                n = n / 10;
            }
            if(sum==1) return true;

            //this is means we are not able to add new sum and so there is repeated cycle which does not contain 1
            else if(!set.add(sum)){
                return false;
            }
            set.add(sum);
            n=sum;
        }
    }

    //way 2
    public static boolean isHappy(int n) {
        if(n == 1) return true;
        if(n == 4) return false;
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n%10,2);
            n /= 10;
        }
        return isHappy(sum);
    }
}
