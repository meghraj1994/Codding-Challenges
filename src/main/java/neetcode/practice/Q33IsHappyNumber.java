package neetcode.practice;

public class Q33IsHappyNumber {
    public static void main(String[] args) {

        int n = 19;
        System.out.println(isHappyNumber(n));

    }

    public static boolean isHappyNumber(int n) {
        if (n == 1) return true;
        if (n == 4) return false;
        int sum = 0;

        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return isHappyNumber(sum);
    }
}
