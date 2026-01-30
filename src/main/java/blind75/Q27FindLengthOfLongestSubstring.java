package blind75;

import java.util.HashSet;
import java.util.Set;

public class Q27FindLengthOfLongestSubstring {

    public static void main(String[] args) {
        String s1 = "abcabcbb";   //3
        String s2 = "bbbb";    //1
        String s3 = "pwwkey";  //1

        System.out.println(findLongestSubstring(s1));
//        System.out.println(findLongestSubstring(s2));
//        System.out.println(findLongestSubstring(s3));
    }


    public static int findLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            while (seen.contains(ch)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(ch);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
