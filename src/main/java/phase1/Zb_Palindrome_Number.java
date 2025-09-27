package phase1;

public class Zb_Palindrome_Number {

    public static void main(String[] args) {
        int x = 121;         //output=true
        int x1 = -121;       //output=false
        int x2 = 10;           //output=false

        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(x1));
        System.out.println(isPalindrome(x2));
    }

    public static boolean isPalindrome(int x) {
        if (x <= 0) return false;

        int original = x;
        int reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return original == reversed ? true : false;
    }
}
