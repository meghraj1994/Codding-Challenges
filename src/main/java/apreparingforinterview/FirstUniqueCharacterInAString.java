package apreparingforinterview;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        String s1 = "leetcode";
//        Output: 0

        String s2 = "loveleetcode";
//        Output: 2

        String s3 = "aabb";
//        Output: -1

        String s4 = "lloveeetcode";

//        System.out.println(firstUniqueChar(s1));
//        System.out.println(firstUniqueChar(s2));
//        System.out.println(firstUniqueChar(s3));
//        System.out.println(firstUniqueChar(s4));

        System.out.println(firstUniqChar(s2));

    }

    public static int firstUniqueChar(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=0; i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

       return -1;
    }

    public static int firstUniqChar(String s) {
        int[] charCount = new int[26]; // Assuming only lowercase English letters

        // Populate the array with character frequencies
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Iterate through the string to find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i; // Found the first unique character
            }
        }

        return -1; // No unique character found
    }


}
