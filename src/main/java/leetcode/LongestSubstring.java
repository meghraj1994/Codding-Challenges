package leetcode;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {

        String s1 = "abcabcbb";
//        Output: 3

        String s2 = "bbbbb";
//        Output: 1

        String s3= "pwwkew";
//        Output: 3

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));

    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        for(Character ch:s.toCharArray()){
            set.add(ch);
        }

        return set.size();

    }
}
