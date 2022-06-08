package leetcode;

public class FibonacciSeries {

    /*
      Input: n = 2 Output: 1 Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
      Input: n = 3 Output: 2 Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
      Input: n = 4 Output: 3 Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

      0,1,1,2,3,5,8,13,21,34,55
     */

    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(10));
    }

    public static int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int sum = 0;

        while (n > 1) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }
        return sum;
    }
}
