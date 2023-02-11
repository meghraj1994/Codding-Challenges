package leetcode;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
       /* Example 1:
        Input: n = 5
        Output: 10
        Explanation: The smallest multiple of both 5 and 2 is 10. */


   /*  Example 2:
        Input: n = 6
        Output: 6
        Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself. */
        System.out.println(smallestEvenMultiple(5));
        System.out.println(smallestEvenMultiple(6));

    }
    public static int smallestEvenMultiple(int n) {
        if(n%2 != 0){
            return 2*n;
        } else {
            return lcm(2,n);
        }

    }

    public static int lcm(int s,int l){
        int m = s>l?s:l;
        int lcm = 0;
        for(int i=m;i<=s*l;i+=m){
            if(i%s==0 && i%l==0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }
}
