package leetcode;

public class ClimbingStairs {

    /*
    * Input: n = 2 Output: 2 Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
    *Input: n = 3 Output: 3 Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
     */

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(1));

    }

    public static int climbStairs(int n) {
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }
}
