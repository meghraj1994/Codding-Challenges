package blind75;

import java.util.HashSet;
import java.util.Set;

public class Q28HappyNumber {

    public static void main(String[] args) {
        int n=19 ;    //true
        System.out.println(isHappyNumber(19));
    }

    public static boolean isHappyNumber(int n){

        Set<Integer> seen = new HashSet<>();

        while (n!=1 && !seen.contains(n)){
            seen.add(n);

            n= getSquare(n);
        }
        return n==1;

    }

    private static int getSquare(int n) {
        int sum=0;

        while (n>0){
            sum +=Math.pow(n%10,2);
            n /=10;
        }
        return sum;
    }
}
