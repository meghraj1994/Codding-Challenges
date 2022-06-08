package leetcode;

import java.util.HashMap;

public class RomanToInteger {
    /*
     * Input: s = "LVIII" Output: 58 Explanation: L = 50, V= 5, III = 3.
     * Input: s = "MCMXCIV" Output: 1994 Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     * Input: s = "III" Output: 3  Explanation: III = 3.
     * */
    public static void main(String[] args) {
        String s1 = "LVIII";
        String s2 = "MCMXCIV";
        String s3 = "III";

        System.out.println(romanToInteger(s1));
        System.out.println(romanToInteger(s2));
        System.out.println(romanToInteger(s3));
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int result = map.get(s.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }


        return result;
    }
}
