package leetcode;

public class Palindrome {
    public static void main(String[] args) {
//        inputs x=121 o/p=true input=-121 output=false;
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int n){
        if(n<0) return false;
        int original = n;
        int reverse = 0;

        while (n!=0){
            reverse = reverse*10+n%10;
            n = n/10;
        }
        if (reverse==original) return true;
        return false;
    }
}
