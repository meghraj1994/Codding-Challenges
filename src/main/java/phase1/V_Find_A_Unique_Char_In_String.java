package phase1;

import java.util.HashMap;
import java.util.Map;

public class V_Find_A_Unique_Char_In_String {

    public static void main(String[] args) {
        String s = "leetcode"; //output=0
        String s1 = "loveleetcode"; //output=2
        String s2 = "aabb"; //output=-1; since no unique character

        System.out.println(findIndexOfFirstUniqueCharacter(s));
        System.out.println(findIndexOfFirstUniqueCharacter(s1));
        System.out.println(findIndexOfFirstUniqueCharacter(s2));

    }

    public static int findIndexOfFirstUniqueCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }


        return -1;
    }
}
