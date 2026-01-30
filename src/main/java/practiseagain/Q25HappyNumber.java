package practiseagain;

import java.util.HashSet;
import java.util.Set;

public class Q25HappyNumber {
    public static void main(String[] args) {
        int n = 19; // if sum of square of each digits of number is eventually 1 then its happy number
        System.out.println(isHappyNumber(n));
        System.out.println(isHappyNumberOptimal(n));
    }

    public static boolean isHappyNumber(int n) {

        if (n == 1) {
            return true;
        }
        if (n == 4) {
            return false;
        }

        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return isHappyNumber(sum);
    }

    public static boolean isHappyNumberOptimal(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSquareSum(n);
        }
        return n == 1;
    }

    private static int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}
