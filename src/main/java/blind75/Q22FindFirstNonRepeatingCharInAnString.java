package blind75;

import java.util.HashMap;
import java.util.Map;

public class Q22FindFirstNonRepeatingCharInAnString {

    public static void main(String[] args) {
        String s1 = "leetcode";    //0
        String s2="loveleetcode";   //2

        System.out.println(indexOfFirstUniqueCharUsingMap(s1));
        System.out.println(indexOfFirstUniqueCharUsingMap(s2));

        System.out.println("-----another way----------");
        System.out.println(indexOfFirstUniqueCharUsingEfficientWay(s1));
        System.out.println(indexOfFirstUniqueCharUsingEfficientWay(s2));
    }

    public static int indexOfFirstUniqueCharUsingMap(String s){

        Map<Character,Integer> map = new HashMap<>();

        for(Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<s.length();i++){
            Character ch = s.charAt(i);
            if(map.get(ch)==1) return i;
        }
        return -1;

    }

    public static int indexOfFirstUniqueCharUsingEfficientWay(String s){

        int[] countArray = new int[26];

        for(Character ch : s.toCharArray()){
            countArray[ch-'a']++;
        }
        for(int i=0; i<s.length();i++){
            if(countArray[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
