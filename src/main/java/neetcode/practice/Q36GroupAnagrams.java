package neetcode.practice;

import java.util.*;

public class Q36GroupAnagrams {

    public static void main(String[] args) {
        String[] input1 = {"eat", "tea", "ate", "nat", "bat"};
        String[] input2 = {" "};
        String[] input3 = {"a"};
        System.out.println(groupAnagrams(input1));
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        if (strings.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List> map = new HashMap<>();
        //step1:create key for each string in stringArray
        int[] count = new int[26];
        for (String s : strings) {
            Arrays.fill(count, 0);
            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            //step2: check if key is already present then store the value as list if key is not present then create new key and store value as list

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);


        }
        return new ArrayList(map.values());
    }
}
