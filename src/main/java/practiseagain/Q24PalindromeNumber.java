package practiseagain;

public class Q24PalindromeNumber {
    public static void main(String[] args) {
        int n1 = 121; // true
        int n2 = -121; //false;
        int n3 = 10;    //false

        System.out.println(isPalindrome(n1));
        System.out.println(isPalindrome(n2));
        System.out.println(isPalindrome(n3));
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int originalNumber = n;
        int reversedNumber = 0;
        while (n != 0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
