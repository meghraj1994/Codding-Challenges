package apreparingforinterview;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "";
        String s2 = "race a car";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder cleanStr = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanStr.append(ch);
            }
        }
        String cleaned = cleanStr.toString();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
