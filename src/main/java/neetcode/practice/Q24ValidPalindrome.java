package neetcode.practice;

public class Q24ValidPalindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: panama"; //true
        String s2 = " ";    //true

        System.out.println(isValidAnagram(s1));
        System.out.println(isValidAnagram(s2));

        System.out.println(isValidAnagramImproved(s1));
        System.out.println(isValidAnagramImproved(s2));
    }

    public static boolean isValidAnagram(String s1) {
        s1 = s1.toLowerCase();
        StringBuilder cleanString = new StringBuilder();
        for (Character ch : s1.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanString.append(ch);
            }
        }

        int left = 0;
        int right = cleanString.length() - 1;
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isValidAnagramImproved(String s1) {
        s1 = s1.toLowerCase();
        int left = 0;
        int right = s1.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s1.charAt(left))) {
                left++;
            }

            while (left<right && !Character.isLetterOrDigit(s1.charAt(right))){
                right--;
            }
            if(s1.charAt(left) != s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
