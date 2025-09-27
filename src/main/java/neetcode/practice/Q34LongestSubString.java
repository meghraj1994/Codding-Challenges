package neetcode.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q34LongestSubString {
    public static void main(String[] args) {
        String s1 = "abcabcbb"; //output =3
        String s2 = "bbbb"; //1
        String s3 = "pwwkey";//3

        System.out.println(lengthOfLongestSubstring(s1));
    }
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, max = 0;
        Set<Character> seen = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            if (!seen.contains(c)) {
                seen.add(c);
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
