package neetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class Q22FindUniqueCharacterInString {

    public static void main(String[] args) {
        String s1 = "leetcode"; //output=0 => l is first non repeating
        String s2 = "loveleetcode";  //output= 2 => v is first non repeating
        String s3 = "aabb"; //output =-1; => because there no non repeating char

        System.out.println(findUniqueChar(s1));
        System.out.println(findUniqueChar(s2));
        System.out.println(findUniqueChar(s3));
    }

    public static int findFirstNonRepeatingUsingHashMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int findUniqueChar(String s) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for(int i=0; i<s.length();i++){
            if(count[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
