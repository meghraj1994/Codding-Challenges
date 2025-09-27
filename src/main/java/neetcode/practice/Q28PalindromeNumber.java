package neetcode.practice;

public class Q28PalindromeNumber {

    public static void main(String[] args) {
        int n1 = 121; //output=true
        int n2 = -121; //output = false
        int n3 = 10;

        System.out.println(isPalindromeNumber(n1));
        System.out.println(isPalindromeNumber(n2));
        System.out.println(isPalindromeNumber(n3));

    }

    public static boolean isPalindromeNumber(int n) {
        if (n < 0) {
            return false;
        }
        int originalValue = n;
        int newValue = 0;
        while (n != 0) {
            newValue = newValue * 10 + n % 10;
            n = n / 10;

        }
        return originalValue == newValue;
    }
}
