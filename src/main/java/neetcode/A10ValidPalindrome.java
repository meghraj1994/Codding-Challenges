package neetcode;

public class A10ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        String s1 = " "; //true
        String s3 = "A man, a plan, a canal:panama"; //true
        System.out.println(isValidPalindrome(s));
        System.out.println(isValidPalindrome(s1));
        System.out.println(isValidPalindrome(s3));
    }

    public static boolean isValidPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
