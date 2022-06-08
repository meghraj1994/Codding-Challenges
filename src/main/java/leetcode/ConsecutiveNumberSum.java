package leetcode;

public class ConsecutiveNumberSum {

    /*
    * Input = 5 ==> (5 or 2+3) ie Output = 2 type ---> 5 can be formed 2 types with consecutive integer
    * Input = 9 ==>(9 or 4+5 or 2+3+4) ie output =3
    * Input = 15 ==>(15 or 4+5+6 or 7+8 or 1+2+3+4+5) ie output = 5 times
    *
     */

    public static void main(String[] args) {

        System.out.println(consecutiveSum(15));
        System.out.println(consecutiveSum(5));
        System.out.println(consecutiveSum(9));

    }

    public static int consecutiveSum(int N) {
        int ans = 0;
        for(int n=2;n*(n+1)/2<=N;n++){
            if((N-n*(n+1)/2)%n==0){
                ans++;
            }
        }
        return ans+1;
    }
}
